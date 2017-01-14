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
        void onLoadStatusComplete(Status.Type statusType);

        void onAuthSuccess(String credential, User entity);

        void showError(String message);
    }

    interface Presenter {
        void setView(AuthContract.View view);

        void loadStatus();

        void callGetUser(String authorization);

        void callAccessTokenGettingUser(String cliId, String cliSecret, String code);
    }
}