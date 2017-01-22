package br.com.monitoratec.treinamentoandroid.infrastructure.storage.manager;

import java.util.List;

import javax.inject.Inject;

import br.com.monitoratec.treinamentoandroid.domain.entity.Repo;
import br.com.monitoratec.treinamentoandroid.domain.entity.User;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;
import br.com.monitoratec.treinamentoandroid.infrastructure.storage.service.GitHubService;
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

    @Inject
    public GitHubManager(GitHubService gitHubService) {
        mGitHubService = gitHubService;
    }

    @Override
    public Observable<User> getUser(String authorization) {
        return mGitHubService.getUser(authorization)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<List<Repo>> getRepos(String credential) {
        return mGitHubService.getRepos(credential)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}