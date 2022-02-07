package testguice;

import javax.inject.Inject;
import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class UpdateSearcher {

    private List<String> releases;
    private String baseVersion;

    @Inject
    public UpdateSearcher(@Releases List<String> releases, @Version String baseVersion) {
        this.releases = releases;
        this.baseVersion = baseVersion;
    }

    public boolean hasNewUpdate() {
        return releases.stream().anyMatch(it -> it.compareTo(baseVersion) > 0);
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Qualifier
    public @interface Releases { }

    @Retention(RetentionPolicy.RUNTIME)
    @Qualifier
    public @interface Version { }
}
