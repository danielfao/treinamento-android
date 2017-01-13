package br.com.monitoratec.treinamentoandroid.infraestructure.storage.manager;

import br.com.monitoratec.treinamentoandroid.domain.entity.Status;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubStatusRepository;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.service.GitHubStatusService;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *
 * Manager for for {@link GitHubStatusRepository}
 *
 * Created by danifao on 2017-01-13.
 */

public class GitHubStatusManager implements GitHubStatusRepository {

    private final GitHubStatusService mGitHubStatusService;

    public GitHubStatusManager(GitHubStatusService gitHubStatusService) {
        mGitHubStatusService = gitHubStatusService;
    }

    @Override
    public Observable<Status> lastMessage() {
        return mGitHubStatusService.lastMessage()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}