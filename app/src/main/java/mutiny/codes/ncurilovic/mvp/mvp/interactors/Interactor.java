package mutiny.codes.ncurilovic.mvp.mvp.interactors;

import mutiny.codes.ncurilovic.mvp.mvp.listeners.Listener;

/**
 * Created by nikola on 12.11.16..
 */
public interface Interactor {

    interface SayHello {

        void getMessage(Listener<String> listener);
    }

}
