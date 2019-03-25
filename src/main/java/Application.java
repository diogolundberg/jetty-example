import api.RestConfig;
import org.apache.deltaspike.cdise.servlet.CdiServletRequestListener;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;


public class Application {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addEventListener(new CdiServletRequestListener());

        ResourceConfig config = new RestConfig();
        ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(config));
        context.addServlet(jerseyServlet,"/*");

        server.start();
    }
}