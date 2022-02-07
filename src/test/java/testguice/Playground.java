package testguice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Playground {
    public static void main(String... args) {
        Injector injector = Guice.createInjector(new UpdateModule());
        var searcher = injector.getInstance(UpdateSearcher.class);
        System.out.println(searcher.hasNewUpdate());
    }
}
