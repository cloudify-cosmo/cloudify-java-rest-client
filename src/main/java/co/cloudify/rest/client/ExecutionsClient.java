package co.cloudify.rest.client;

import java.util.Collections;
import java.util.Map;

import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;

import co.cloudify.rest.client.exceptions.CloudifyClientException;
import co.cloudify.rest.client.exceptions.ExecutionNotFoundException;
import co.cloudify.rest.client.params.ExecutionStartParams;
import co.cloudify.rest.model.Deployment;
import co.cloudify.rest.model.Execution;
import co.cloudify.rest.model.ListResponse;

/**
 * A REST client for executions-related operations.
 *
 * @author Isaac Shabtay
 */
public class ExecutionsClient extends AbstractCloudifyClient {
    /** Base API path. */
    private static final String BASE_PATH = "/api/v3.1/executions";
    /** API path for specific resource. */
    private static final String ID_PATH = BASE_PATH + "/{id}";

    public ExecutionsClient(Client restClient, WebTarget baseTarget) {
        super(restClient, baseTarget);
    }

    protected WebTarget getExecutionsTarget() {
        return getTarget(BASE_PATH);
    }

    protected Builder getExecutionsBuilder() {
        return getBuilder(getExecutionsTarget());
    }

    protected Builder getExecutionBuilder(String id) {
        return getBuilder(getTarget(ID_PATH, Collections.singletonMap("id", id)));
    }

    /**
     * Returns a single execution by ID.
     *
     * @param id the execution ID
     *
     * @return A corresponding {@link Execution} instance.
     */
    public Execution get(String id) {
        try {
            return getExecutionBuilder(id).get(Execution.class);
        } catch (NotFoundException ex) {
            throw new ExecutionNotFoundException(id, ex);
        } catch (WebApplicationException ex) {
            throw CloudifyClientException.create("Failed retrieving execution", ex);
        }
    }

    /**
     * Lists all executions.
     *
     * @return A list of all executions.
     */
    public ListResponse<Execution> list() {
        return list((String) null);
    }

    public ListResponse<Execution> list(final Deployment deployment) {
        return list(deployment.getId());
    }

    public ListResponse<Execution> list(final String deploymentId) {
        WebTarget executionsTarget = getExecutionsTarget();
        if (deploymentId != null) {
            executionsTarget = executionsTarget
                    .queryParam("deployment_id", deploymentId);
        }
        try {
            return getBuilder(executionsTarget).get(
                    new GenericType<ListResponse<Execution>>() {});
        } catch (WebApplicationException ex) {
            throw CloudifyClientException.create("Failed listing executions", ex);
        }
    }

    /**
     * Starts an execution.
     *
     * @param deployment deployment to start for
     * @param workflowId workflow to start
     * @param parameters a {@link Map} of execution parameters
     *
     * @return An {@link Execution} object, representing the created execution.
     */
    public Execution start(Deployment deployment, String workflowId, Map<String, Object> parameters) {
        return start(deployment.getId(), workflowId, parameters);
    }

    /**
     * Starts an execution.
     *
     * @param deploymentId deployment to start for
     * @param workflowId   workflow to start
     * @param parameters   a {@link Map} of execution parameters
     *
     * @return An {@link Execution} object, representing the created execution.
     */
    public Execution start(String deploymentId, String workflowId, Map<String, Object> parameters) {
        ExecutionStartParams params = new ExecutionStartParams(deploymentId, workflowId, parameters);
        try {
            return getExecutionsBuilder().post(Entity.json(params), Execution.class);
        } catch (WebApplicationException ex) {
            throw CloudifyClientException.create("Failed starting execution", ex);
        }
    }
}
