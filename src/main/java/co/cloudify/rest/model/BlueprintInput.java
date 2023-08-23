package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BlueprintInput implements Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    @XmlElement
    private String type;
    @XmlElement(name = "default")
    private Object defaultValue;
    @XmlElement
    private String description;
    @XmlElement
    private List<InputConstraint> constraints;
    @XmlElement(name = "display_label")
    private String displayLabel;
    @XmlElement(name = "hidden")
    private boolean hidden;

    public String getType() {
        return type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public String getDescription() {
        return description;
    }

    public List<InputConstraint> getConstraints() {
        return constraints;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("type", type)
                .append("defaultValue", defaultValue)
                .append("description", description)
                .append("constraints", constraints)
                .toString();
    }
}
