package api;

import api.message.Service;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

class BinderConfig extends AbstractBinder {
    @Override
    protected void configure() {
        bind(Service.class).to(Service.class);
    }
}
