package br.com.monitoratec.treinamentoandroid.presentation.ui.auth;

import br.com.monitoratec.treinamentoandroid.domain.entity.Status;
import br.com.monitoratec.treinamentoandroid.domain.entity.User;

/**
 *
 * GitHub authentication MVP contract.
 *
 * Created by danifao on 2017-01-13.
 */

public interface AuthContract {

    interface View {
        void onGetStatusComplete(Status.Type statusType);

        void onGetUserComplete(String credential, User user);

        void showError(String message);
    }

    interface Presenter {
        void setView(AuthContract.View view);

        void getStatus();

        void getUser(String authorization);

        void getAccessTokenAndUser(String clientId, String clientSecret, String code);
    }
}