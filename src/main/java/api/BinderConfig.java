package api;

import api.message.MessageService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

class BinderConfig extends AbstractBinder {
    @Override
    protected void configure() {
        bind(MessageService.class).to(MessageService.class);
    }
}
