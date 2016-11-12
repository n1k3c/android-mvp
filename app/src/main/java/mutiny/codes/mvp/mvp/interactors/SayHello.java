package mutiny.codes.mvp.mvp.interactors;

import mutiny.codes.mvp.mvp.listeners.Listener;

/**
 * Created by nikola on 12.11.16..
 */
public class SayHello implements Interactor.SayHello {

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
