package api;

import api.message.MessageService;
import org.glassfish.jersey.internal.inject.AbstractBinder;

class BinderConfig extends AbstractBinder {
    @Override
    protected void configure() {
        bind(MessageService.class).to(MessageService.class);
    }
}
