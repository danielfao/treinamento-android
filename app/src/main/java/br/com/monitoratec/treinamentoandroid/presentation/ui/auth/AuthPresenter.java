package br.com.monitoratec.treinamentoandroid.presentation.ui.auth;

import javax.inject.Inject;

import br.com.monitoratec.treinamentoandroid.domain.entity.Status;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubOAuthRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubStatusRepository;

/**
 *
 * GitHub authentication presenter.
 *
 * Created by danifao on 2017-01-13.
 */

public class AuthPresenter implements AuthContract.Presenter {

    private AuthContract.View mView;
    private GitHubRepository mGitHubRepository;
    private GitHubStatusRepository mGitHubStatusRepository;
    private GitHubOAuthRepository mGitHubOAuthRepository;

    @Inject
    public AuthPresenter(GitHubRepository gitHubRepository,
                         GitHubStatusRepository gitHubStatusRepository,
                         GitHubOAuthRepository gitHubOAuthRepository) {
        mGitHubRepository = gitHubRepository;
        mGitHubStatusRepository = gitHubStatusRepository;
        mGitHubOAuthRepository = gitHubOAuthRepository;
    }

    @Override
    public void setView(AuthContract.View view) {
        mView = view;
    }

    @Override
    public void getStatus() {
        mGitHubStatusRepository.getLastStatus()
                .subscribe(status -> {
                    mView.onGetStatusComplete(status.type);
                }, error -> {
                    mView.onGetStatusComplete(Status.Type.MAJOR);
                });
    }

    @Override
    public void getUser(String authorization) {
        mGitHubRepository.getUser(authorization)
                .subscribe(user -> {
                    mView.onGetUserComplete(authorization, user);
                }, error -> {
                    mView.showError(error.getMessage());
                });
    }

    @Override
    public void getAccessTokenAndUser(String clientId,
                                           String clientSecret,
                                           String code) {
        mGitHubOAuthRepository.getAccessToken(clientId, clientSecret, code)
                .subscribe(entity -> {
                    getUser(entity.getAuthCredential());
                }, error -> {
                    mView.showError(error.getMessage());
                });
    }
}