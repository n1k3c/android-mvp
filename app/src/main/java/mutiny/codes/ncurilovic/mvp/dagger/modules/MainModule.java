package mutiny.codes.ncurilovic.mvp.dagger.modules;

import dagger.Module;
import dagger.Provides;
import mutiny.codes.ncurilovic.mvp.mvp.Main;
import mutiny.codes.ncurilovic.mvp.mvp.interactors.Interactor;
import mutiny.codes.ncurilovic.mvp.mvp.interactors.SayHelloInteractor;
import mutiny.codes.ncurilovic.mvp.mvp.presenters.MainPresenter;

/**
 * Created by nikola on 13.11.16..
 */
@Module
public class MainModule {

    Main.View view;

    public MainModule(Main.View view) {
        this.view = view;
    }

    @Provides
    Main.View provideMainView() {
        return view;
    }

    @Provides
    Main.Presenter provideMainPresenter(MainPresenter presenter) {
        return presenter;
    }

    @Provides
    Interactor.SayHello provideSayHelloInteractor(SayHelloInteractor interactor) {
        return interactor;
    }

}
