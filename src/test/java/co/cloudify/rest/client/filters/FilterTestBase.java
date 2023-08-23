package co.cloudify.rest.client.filters;

import static org.mockito.Mockito.mock;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.MultivaluedHashMap;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class FilterTestBase {
    protected ClientRequestContext requestContext;

    @BeforeEach
    public void init() {
        requestContext = mock(ClientRequestContext.class);
        Mockito.when(requestContext.getHeaders()).thenReturn(new MultivaluedHashMap<>());
    }

    protected void invoke(final ClientRequestFilter filter) throws Exception {
        filter.filter(requestContext);
    }
}
