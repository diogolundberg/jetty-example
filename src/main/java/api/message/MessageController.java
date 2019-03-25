package api.message;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("msg")
public class MessageController {

    @Inject
    private MessageService messageService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        Message message = new Message();
        message.setMessage("message");
        return messageService.save(message).getMessage();
    }
}