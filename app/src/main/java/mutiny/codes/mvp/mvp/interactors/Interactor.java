package mutiny.codes.mvp.mvp.interactors;

import mutiny.codes.mvp.mvp.listeners.Listener;

/**
 * Created by nikola on 12.11.16..
 */
public interface Interactor {

    interface SayHello {

        void getMessage(Listener<String> listener);
    }

}
