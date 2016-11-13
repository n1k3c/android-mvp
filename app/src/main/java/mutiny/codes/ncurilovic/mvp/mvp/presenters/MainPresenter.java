package mutiny.codes.ncurilovic.mvp.mvp.presenters;

import javax.inject.Inject;

import mutiny.codes.ncurilovic.mvp.mvp.Main;
import mutiny.codes.ncurilovic.mvp.mvp.interactors.Interactor;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by nikola on 12.11.16..
 */
public class MainPresenter implements Main.Presenter {

    Main.View view;

    Interactor.SayHello sayHelloInteractor;

    @Inject
    public MainPresenter(Main.View view, Interactor.SayHello sayHelloInteractor) {
        this.view = view;
        this.sayHelloInteractor = sayHelloInteractor;
    }

    @Override
    public void getMessage() {
        sayHelloInteractor.getMessage()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        Timber.d("Completed!");
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showError(e.toString());
                    }

                    @Override
                    public void onNext(String message) {
                        view.showMessage(message);
                    }
                });
    }

}
