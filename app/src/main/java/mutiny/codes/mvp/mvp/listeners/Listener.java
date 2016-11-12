package mutiny.codes.mvp.mvp.listeners;

/**
 * Created by nikola on 12.11.16..
 */
public interface Listener<Result> {

    void onSuccess(Result result);

    void onFailure(String message);

}
