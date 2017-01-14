package br.com.monitoratec.treinamentoandroid.infraestructure.storage.manager;

import br.com.monitoratec.treinamentoandroid.domain.entity.User;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.service.GitHubService;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *
 * Manager for for {@link GitHubRepository}
 *
 * Created by danifao on 2017-01-13.
 */

public class GitHubManager implements GitHubRepository {

    private final GitHubService mGitHubService;

    public GitHubManager(GitHubService gitHubService) {
        mGitHubService = gitHubService;
    }

    @Override
    public Observable<User> getUser(String authorization) {
        return mGitHubService.getUser(authorization)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}