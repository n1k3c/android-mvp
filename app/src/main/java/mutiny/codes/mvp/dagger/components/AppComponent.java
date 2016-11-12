package mutiny.codes.mvp.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import mutiny.codes.mvp.dagger.components.modules.AppContextModule;

/**
 * Created by nikola on 12.11.16..
 */
@Component(modules = {
        AppContextModule.class
})
@Singleton
public interface AppComponent {


}