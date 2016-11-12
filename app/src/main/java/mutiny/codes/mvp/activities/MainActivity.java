package mutiny.codes.mvp.activities;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import mutiny.codes.mvp.R;
import mutiny.codes.mvp.mvp.Main;
import mutiny.codes.mvp.mvp.presenters.MainPresenter;
import timber.log.Timber;

/**
 * Created by nikola on 12.11.16..
 */
public class MainActivity extends BaseActivity implements Main.View {

    Main.Presenter presenter;

    @Bind(R.id.tvHello)
    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new MainPresenter(this);

        presenter.getMessage();
    }

    @Override
    protected int getContentViewResource() {
        return R.layout.activity_main;
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
