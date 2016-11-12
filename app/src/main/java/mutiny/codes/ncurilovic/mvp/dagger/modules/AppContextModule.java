package mutiny.codes.ncurilovic.mvp.dagger.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import mutiny.codes.ncurilovic.mvp.TheApplication;


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
