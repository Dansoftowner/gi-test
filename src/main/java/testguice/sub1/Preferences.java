package testguice.sub1;

import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.inject.Singleton;

@Singleton
public class Preferences {

    private Source source;

    @Inject
    public Preferences(Provider<Source> source) {
        this.source = source.get();
    }

    public void save() {
        source.update();
    }
}
