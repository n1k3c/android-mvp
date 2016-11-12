package mutiny.codes.ncurilovic.mvp;

import android.app.Application;

import mutiny.codes.ncurilovic.mvp.dagger.components.AppComponent;
import mutiny.codes.ncurilovic.mvp.dagger.components.DaggerAppComponent;
import timber.log.Timber;

/**
 * Created by nikola on 12.11.16..
 */
public class TheApplication extends Application {

    private static TheApplication instance;

    protected AppComponent appComponent;

    public static void setInstance(TheApplication instance) {
        TheApplication.instance = instance;
    }

    public static TheApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);
        init();
    }

    private void init() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
