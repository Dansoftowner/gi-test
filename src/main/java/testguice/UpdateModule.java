package testguice;

import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.Provides;

import java.util.List;

public class UpdateModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(List.class).annotatedWith(UpdateSearcher.Releases.class).toInstance(List.of("0", "3"));
        bind(String.class).annotatedWith(UpdateSearcher.Version.class).toInstance("1");
    }

   /* @Provides
    @UpdateSearcher.Version
    public String provideVersion() {
        return "1";
    }

    @Provides
    @UpdateSearcher.Releases
    public List<String> provideReleases() {
        return List.of("0", "3");
    }*/
}
