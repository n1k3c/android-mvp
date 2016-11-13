package mutiny.codes.ncurilovic.mvp.mvp.interactors;

import rx.Observable;

/**
 * Created by nikola on 12.11.16..
 */
public interface Interactor {

    interface SayHello {

        Observable getMessage();
    }

}
