package mutiny.codes.ncurilovic.mvp.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import mutiny.codes.ncurilovic.mvp.TheApplication;
import mutiny.codes.ncurilovic.mvp.dagger.components.AppComponent;

/**
 * Created by nikola on 12.11.16..
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getContentViewResource());
        ButterKnife.bind(this);

        injectDependencies(((TheApplication) getApplication()).getAppComponent());
    }

    @LayoutRes
    protected abstract int getContentViewResource();

    protected abstract void injectDependencies(AppComponent appComponent);

}
