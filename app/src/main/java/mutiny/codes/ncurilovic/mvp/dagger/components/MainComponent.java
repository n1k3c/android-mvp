package mutiny.codes.ncurilovic.mvp.dagger.components;

import dagger.Subcomponent;
import mutiny.codes.ncurilovic.mvp.activities.MainActivity;
import mutiny.codes.ncurilovic.mvp.dagger.modules.MainModule;

/**
 * Created by nikola on 13.11.16..
 */
@Subcomponent(modules = {
        MainModule.class
})
public interface MainComponent {

    void inject(MainActivity activity);

}
