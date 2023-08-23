package co.cloudify.rest.client.filters;

import java.io.IOException;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.ext.Provider;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A {@link ClientRequestFilter} implementation for adding the tenant header.
 *
 * @author Isaac Shabtay
 */
@Provider
public class TenantFilter implements ClientRequestFilter {
    private static final String TENANT_HEADER = "Tenant";

    private String tenant;

    public TenantFilter(final String tenant) {
        Validate.notBlank(tenant);
        this.tenant = tenant;
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        requestContext.getHeaders().putSingle(TENANT_HEADER, tenant);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("tenant", tenant)
                .toString();
    }
}
