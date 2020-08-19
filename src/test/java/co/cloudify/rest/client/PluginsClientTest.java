package co.cloudify.rest.client;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Invocation.Builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import co.cloudify.rest.client.exceptions.PluginNotFoundException;
import co.cloudify.rest.model.Plugin;

public class PluginsClientTest {
    private static final String PLUGIN_ID = "plugin-id";

    private PluginsClient pluginsClient;
    private Builder builder;

    @BeforeEach
    public void initTest() {
        pluginsClient = mock(PluginsClient.class);
        Mockito.when(pluginsClient.get(PLUGIN_ID)).thenCallRealMethod();
        builder = mock(Builder.class);
        Mockito.when(pluginsClient.getBuilder(PLUGIN_ID)).thenReturn(builder);
    }

    @Test
    public void testGetNormal() {
        Plugin plugin = new Plugin();
        Mockito.when(builder.get(Plugin.class)).thenReturn(plugin);
        Plugin returned = pluginsClient.get(PLUGIN_ID);
        assertTrue(returned == plugin);
    }

    @Test
    public void testGetNotFound() {
        Mockito.when(builder.get(Plugin.class)).thenThrow(NotFoundException.class);
        assertThrows(PluginNotFoundException.class, () -> pluginsClient.get(PLUGIN_ID));
    }
}
