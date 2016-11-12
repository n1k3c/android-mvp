package mutiny.codes.ncurilovic.mvp.mvp;

/**
 * Created by nikola on 12.11.16..
 */
public interface Main {

    interface View {

        void showMessage(String message);

        void showError(String message);
    }

    interface Presenter {

        void getMessage();
    }

}
