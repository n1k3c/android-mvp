package mutiny.codes.ncurilovic.mvp.mvp.interactors;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by nikola on 12.11.16..
 */
public class SayHelloInteractor implements Interactor.SayHello {

    @Inject
    public SayHelloInteractor() {

    }

    public static final String HELLO_WORLD = "Hello world!";

    @Override
    public Observable getMessage() {
        return Observable.create(new Observable.OnSubscribe<String>() {

            @Override
            public void call(final Subscriber<? super String> subscriber) {
                try {
                    subscriber.onNext(HELLO_WORLD);
                } catch (Throwable e) {
                    subscriber.onError(e);
                }
            }
        });
    }

}
