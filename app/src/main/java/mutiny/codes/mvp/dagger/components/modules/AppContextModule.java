package mutiny.codes.mvp.dagger.components.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import mutiny.codes.mvp.TheApplication;

/**
 * Created by nikola on 12.11.16..
 */
@Module
public class AppContextModule {

    @Provides
    public Context provideAppContext() {
        return TheApplication.getInstance();
    }

}
