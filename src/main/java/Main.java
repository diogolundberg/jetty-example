import api.RestConfig;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;


public class Main {

    public static void main(String[] args) throws Exception {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        Server server = JettyHttpContainerFactory.createServer(baseUri, new RestConfig());
        try {
            //server.addEventListener(new Listener());

            server.start();
            server.join();
        }
        finally {
            server.destroy();
        }
    }
}