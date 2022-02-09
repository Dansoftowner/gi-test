package testguice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import testguice.sub1.Preferences;
import testguice.sub1.PreferencesModule;

public class Playground {
    public static void main(String... args) {
        Injector injector = Guice.createInjector(new UpdateModule(), new PreferencesModule());
        /*var searcher = injector.getInstance(UpdateSearcher.class);
        System.out.println("New update: " + searcher.hasNewUpdate());*/

        var pref  = injector.getInstance(Preferences.class);
        var pref2  = injector.getInstance(Preferences.class);
        System.out.println(pref == pref2);
        pref.save();
    }
}
