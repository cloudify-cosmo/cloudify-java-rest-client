package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Note: this class will probably be auto-generated soon, so please don't add
 * any methods to it. It should only contain model fields, getters and setters.
 *
 * @author Isaac Shabtay
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Blueprint implements Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    private String id;
    @XmlElement(name = "created_at")
    private Date createdAt;
    @XmlElement(name = "created_by")
    private String createdBy;
    @XmlElement(name = "updated_at")
    private Date updatedAt;
    @XmlElement(name = "main_file_name")
    private String mainFileName;
    @XmlElement(name = "tenant_name")
    private String tenantName;
    @XmlElement
    private BlueprintPlan plan;
    @XmlElement
    private String description;
    @XmlElement(name = "private_resource")
    private boolean privateResource;
    @XmlElement(name = "resource_availability")
    private String resourceAvailability;
    @XmlElement
    private String visibility;
    @XmlElement(name = "is_hidden")
    private boolean hidden;
    @XmlElement(name = "skipped_fields")
    private Object skippedFields;
    @XmlElement
    private String state;
    @XmlElement
    private String error;
    @XmlElement(name = "error_traceback")
    private String errorTraceback;
    @XmlElement
    private Object labels;
    @XmlElement(name = "upload_execution")
    private Object uploadExecution;
    @XmlElement(name = "plan_p")
    private Object planP;
    @XmlElement(name = "requirements")
    private Object requirements;

    public Blueprint() {
        super();
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BlueprintPlan getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .toString();
    }
}
