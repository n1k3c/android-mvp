package mutiny.codes.ncurilovic.mvp.mvp.interactors;

import javax.inject.Inject;

import mutiny.codes.ncurilovic.mvp.mvp.listeners.Listener;

/**
 * Created by nikola on 12.11.16..
 */
public class SayHelloInteractor implements Interactor.SayHello {

    @Inject
    public SayHelloInteractor() {

    }

    public static final String HELLO_WORLD = "Hello world!";

    @Override
    public void getMessage(Listener<String> listener) {
        try {
            listener.onSuccess(HELLO_WORLD);
        } catch (Throwable e) {
            listener.onFailure(e.toString());
        }
    }

}
