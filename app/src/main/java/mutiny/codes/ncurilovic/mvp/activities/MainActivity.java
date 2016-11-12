package mutiny.codes.ncurilovic.mvp.activities;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.Bind;
import mutiny.codes.ncurilovic.mvp.R;
import mutiny.codes.ncurilovic.mvp.dagger.components.AppComponent;
import mutiny.codes.ncurilovic.mvp.dagger.modules.MainModule;
import mutiny.codes.ncurilovic.mvp.mvp.Main;
import timber.log.Timber;

/**
 * Created by nikola on 12.11.16..
 */
public class MainActivity extends BaseActivity implements Main.View {

    @Inject
    Main.Presenter presenter;

    @Bind(R.id.tvHello)
    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter.getMessage();
    }

    @Override
    protected int getContentViewResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void injectDependencies(AppComponent appComponent) {
        appComponent
                .plus(new MainModule(this))
                .inject(this);
    }

    @Override
    public void showMessage(String message) {
        tvHello.setText(message);
    }

    @Override
    public void showError(String message) {
        Timber.e(message, "Something went wrong!");
    }

}
