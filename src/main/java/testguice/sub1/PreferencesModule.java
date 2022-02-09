package testguice.sub1;

import com.google.inject.AbstractModule;

public class PreferencesModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Source.class).toInstance(new ConsoleSource());
    }
}
