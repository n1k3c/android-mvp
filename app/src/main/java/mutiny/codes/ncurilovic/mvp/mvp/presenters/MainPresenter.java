package mutiny.codes.ncurilovic.mvp.mvp.presenters;

import javax.inject.Inject;

import mutiny.codes.ncurilovic.mvp.mvp.Main;
import mutiny.codes.ncurilovic.mvp.mvp.interactors.Interactor;
import mutiny.codes.ncurilovic.mvp.mvp.listeners.Listener;

/**
 * Created by nikola on 12.11.16..
 */
public class MainPresenter implements Main.Presenter, Listener<String> {

    Main.View view;

    Interactor.SayHello sayHelloInteractor;

    @Inject
    public MainPresenter(Main.View view, Interactor.SayHello sayHelloInteractor) {
        this.view = view;
        this.sayHelloInteractor = sayHelloInteractor;
    }

    @Override
    public void getMessage() {
        sayHelloInteractor.getMessage(this);
    }

    @Override
    public void onSuccess(String message) {
        view.showMessage(message);
    }

    @Override
    public void onFailure(String message) {
        view.showError(message);
    }

}
