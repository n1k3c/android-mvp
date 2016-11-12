package mutiny.codes.ncurilovic.mvp.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import mutiny.codes.ncurilovic.mvp.dagger.modules.AppContextModule;
import mutiny.codes.ncurilovic.mvp.dagger.modules.MainModule;

/**
 * Created by nikola on 12.11.16..
 */
@Component(modules = {
        AppContextModule.class
})
@Singleton
public interface AppComponent {

    MainComponent plus(MainModule module);

}