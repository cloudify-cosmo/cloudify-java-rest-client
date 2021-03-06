package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DeploymentOutputs implements Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "deployment_id")
    private String deploymentId;

    @XmlElement
    private Map<String, Object> outputs;

    public String getDeploymentId() {
        return deploymentId;
    }

    public Map<String, Object> getOutputs() {
        return outputs;
    }
}
