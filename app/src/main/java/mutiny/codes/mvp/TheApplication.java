package mutiny.codes.mvp;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by nikola on 12.11.16..
 */
public class TheApplication extends Application {

    private static TheApplication instance;

    public static void setInstance(TheApplication instance) {
        TheApplication.instance = instance;
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
    }

}
