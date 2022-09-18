package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Deployment implements Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    @XmlElement
    private String id;
    @XmlElement
    private Map<String, Object> inputs;
    @XmlElement
    private Map<String, Object> outputs;
    @XmlElement(name = "created_at")
    private Date createdAt;
    @XmlElement(name = "created_by")
    private String createdBy;
    @XmlElement(name = "updated_at")
    private Date updatedAt;
    @XmlElement
    private String permalink;
    @XmlElement(name = "site_name")
    private String siteName;
    @XmlElement(name = "tenant_name")
    private String tenantName;
    @XmlElement
    private String description;
    @XmlElement(name = "blueprint_id")
    private String blueprintId;
    @XmlElement(name = "policy_types")
    private Object policyTypes;
    @XmlElement
    private Visibility visibility;
    @XmlElement(name = "policy_triggers")
    private Map<String, Object> policyTriggers;
    @XmlElement(name = "private_resource")
    private boolean privateResource;
    @XmlElement(name = "resource_availability")
    private ResourceAvailability resourceAvailability;
    @XmlElement
    private Map<String, Object> capabilities;
    @XmlElement
    private Object groups;
    @XmlElement
    private List<Workflow> workflows;
    @XmlElement(name = "scaling_groups")
    private Map<String, Object> scalingGroups;
    @XmlElement(name = "runtime_only_evaluation")
    private Boolean runtimeOnlyEvaluation;
    @XmlElement(name = "installation_status")
    private String installationStatus;
    @XmlElement(name = "deployment_status")
    private String deploymentStatus;
    @XmlElement(name = "sub_services_status")
    private String subServicesStatus;
    @XmlElement(name = "sub_environments_status")
    private String subEnvironmentsStatus;
    @XmlElement(name = "sub_services_count")
    private Integer subServicesCount;
    @XmlElement(name = "sub_environments_count")
    private Integer subEnvironmentsCount;
    @XmlElement(name = "display_name")
    private String displayName;
    @XmlElement(name = "resource_tags")
    private Object resourceTags;
    @XmlElement(name = "latest_execution_finished_operations")
    private Integer latestExecutionFinishedOperations;
    @XmlElement(name = "latest_execution_total_operations")
    private Integer latestExecutionTotalOperations;
    @XmlElement(name = "environment_type")
    private String environmentType;
    @XmlElement(name = "latest_execution_status")
    private String latestExecutionStatus;
    @XmlElement(name = "labels")
    private Object labels;
    @XmlElement(name = "has_sub_deployments")
    private Boolean hasSubDeployments;
    @XmlElement (name = "workdir_zip")
    private String workdir_zip;
    @XmlElement(name = "deployment_group_id")
    private String deploymentGroupId;
    @XmlElement(name = "skipped_fields")
    private Object skippedFields;
    @XmlElement(name = "schedules")
    private List<Object> schedules;
    @XmlElement(name = "create_execution")
    private Object createExecution;
    @XmlElement(name = "latest_execution")
    private Object latestExecution;
    @XmlElement(name = "deployment_groups")
    private List<Object> deploymentGroups;
    @XmlElement(name = "drifted_instances")
    private Integer driftedInstances;
    @XmlElement(name = "unavailable_instances")
    private Integer unavailableInstances;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public Map<String, Object> getOutputs() {
        return outputs;
    }

    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlueprintId() {
        return blueprintId;
    }

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    public Object getPolicyTypes() {
        return policyTypes;
    }

    public void setPolicyTypes(Object policyTypes) {
        this.policyTypes = policyTypes;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Map<String, Object> getPolicyTriggers() {
        return policyTriggers;
    }

    public void setPolicyTriggers(Map<String, Object> policyTriggers) {
        this.policyTriggers = policyTriggers;
    }

    public boolean isPrivateResource() {
        return privateResource;
    }

    public void setPrivateResource(boolean privateResource) {
        this.privateResource = privateResource;
    }

    public ResourceAvailability getResourceAvailability() {
        return resourceAvailability;
    }

    public void setResourceAvailability(ResourceAvailability resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
    }

    public Map<String, Object> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Map<String, Object> capabilities) {
        this.capabilities = capabilities;
    }

    public Object getGroups() {
        return groups;
    }

    public void setGroups(Object groups) {
        this.groups = groups;
    }

    public List<Workflow> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<Workflow> workflows) {
        this.workflows = workflows;
    }

    public Map<String, Object> getScalingGroups() {
        return scalingGroups;
    }

    public void setScalingGroups(Map<String, Object> scalingGroups) {
        this.scalingGroups = scalingGroups;
    }

    public Boolean getRuntimeOnlyEvaluation() {
        return runtimeOnlyEvaluation;
    }

    public void setRuntimeOnlyEvaluation(Boolean runtimeOnlyEvaluation) {
        this.runtimeOnlyEvaluation = runtimeOnlyEvaluation;
    }

    public String getInstallationStatus() {
        return this.installationStatus;
    }

    public void setInstallationStatus(String installationStatus) {
        this.installationStatus = installationStatus;
    }

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public String getSubServicesStatus() {
        return this.subServicesStatus;
    }

    public void setSubServicesStatus(String subServicesStatus) {
        this.subServicesStatus = subServicesStatus;
    }

    public String getSubEnvironmentsStatus() {
        return this.subEnvironmentsStatus;

    }

    public void setSubEnvironmentsStatus(String subEnvironmentsStatus) {
        this.subEnvironmentsStatus = subEnvironmentsStatus;
    }

    public Integer getSubServicesCount() {
        return this.subServicesCount;
    }

    public void setSubServicesCount(Integer subServicesCount) {
        this.subServicesCount = subServicesCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("blueprintId", blueprintId)
                .append("inputs", inputs)
                .toString();
    }

    public Integer getSubEnvironmentsCount() {
        return subEnvironmentsCount;
    }

    public void setSubEnvironmentsCount(Integer subEnvironmentsCount) {
        this.subEnvironmentsCount = subEnvironmentsCount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
