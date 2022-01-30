package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BlueprintPlan implements Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    @XmlElement
    private Map<String, BlueprintInput> inputs;
    @XmlElement
    private Map<Object, Object> relationships;
    @XmlElement
    private String description;
    @XmlElement(name = "deployment_plugins_to_install")
    private List<Object> deploymentPluginsToInstall;
    @XmlElement(name = "host_agent_plugins_to_install")
    private List<Object> hostAgentPluginsToInstall;
    @XmlElement(name = "workflow_plugins_to_install")
    private List<Object> workflowPluginsToInstall;
    @XmlElement(name = "policy_types")
    private Map<String, Object> policyTypes;
    @XmlElement
    private Map<String, Object> outputs;
    @XmlElement
    private Map<String, Object> capabilities;
    @XmlElement(name = "policy_triggers")
    private Object policyTriggers;
    @XmlElement(name = "version")
    private Map<String, Object> version;
    @XmlElement(name = "data_types")
    private Map<String, Object> dataTypes;
    @XmlElement
    private Object groups;
    @XmlElement
    private Map<String, Object> workflows;
    @XmlElement(name = "imported_blueprints")
    private List<Object> importedBlueprints;
    @XmlElement(name = "namespaces_mapping")
    private Map<String, Object> namespacesMapping;
    @XmlElement
    private List<Object> nodes;
    @XmlElement
    private Map<String, Object> metadata;
    @XmlElement(name = "scaling_groups")
    private Map<String, Object> scalingGroups;
    @XmlElement
    private Map<String, Object> policies;
    @XmlElement
    private Object labels;
    @XmlElement(name = "blueprint_labels")
    private Object blueprintLabels;
    @XmlElement(name = "resource_tags")
    private Object resourceTags;
    @XmlElement(name = "deployment_settings")
    private Object deploymentSettings;
    @XmlElement(name = "upload_execution")
    private Object uploadExecution;


    public Map<String, BlueprintInput> getInputs() {
        return inputs;
    }
}
