package br.com.monitoratec.treinamentoandroid.infrastructure.storage.manager;

import javax.inject.Inject;

import br.com.monitoratec.treinamentoandroid.domain.entity.AccessToken;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubOAuthRepository;
import br.com.monitoratec.treinamentoandroid.infrastructure.storage.service.GitHubOAuthService;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *
 * Manager for {@link GitHubOAuthRepository}.
 *
 * Created by danifao on 2017-01-13.
 */

public class GitHubOAuthManager implements GitHubOAuthRepository {

    private final GitHubOAuthService mGitHubOAuthService;

    @Inject
    public GitHubOAuthManager(GitHubOAuthService gitHubOAuthService) {
        mGitHubOAuthService = gitHubOAuthService;
    }

    @Override
    public Observable<AccessToken> getAccessToken(String clientId, String clientSecret, String code) {
        return mGitHubOAuthService.getAccessToken(clientId, clientSecret, code)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}