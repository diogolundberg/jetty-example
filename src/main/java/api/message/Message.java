package api.message;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("msg")
public class Message {

    @Inject
    private Service service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return service.message();
    }
}