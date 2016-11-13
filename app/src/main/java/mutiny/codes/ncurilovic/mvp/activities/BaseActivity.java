package mutiny.codes.ncurilovic.mvp.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by nikola on 12.11.16..
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getContentViewResource());
        ButterKnife.bind(this);

    }

    @LayoutRes
    protected abstract int getContentViewResource();

}
