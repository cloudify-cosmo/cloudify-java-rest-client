package co.cloudify.rest.client.exceptions;

import javax.ws.rs.WebApplicationException;

public class PluginNotFoundException extends CloudifyClientException {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    private String pluginId;

    public PluginNotFoundException(final String pluginId, WebApplicationException cause) {
        super(String.format("Plugin not found: %s", pluginId), cause);
        this.pluginId = pluginId;
    }

    public String getPluginId() {
        return pluginId;
    }
}
