package mutiny.codes.mvp.mvp.presenters;

import mutiny.codes.mvp.mvp.Main;
import mutiny.codes.mvp.mvp.interactors.Interactor;
import mutiny.codes.mvp.mvp.interactors.SayHello;
import mutiny.codes.mvp.mvp.listeners.Listener;

/**
 * Created by nikola on 12.11.16..
 */
public class MainPresenter implements Main.Presenter, Listener<String> {

    Main.View view;

    Interactor.SayHello sayHelloInteractor;

    public MainPresenter(Main.View view) {
        this.view = view;
        sayHelloInteractor = new SayHello();
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
