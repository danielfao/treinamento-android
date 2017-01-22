package br.com.monitoratec.treinamentoandroid.presentation.ui.repos;

import br.com.monitoratec.treinamentoandroid.domain.entity.Repo;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;

/**
 * GitHub List {@link Repo}'s presenter.
 *
 * Created by danifao on 2017-01-22.
 */

public class ReposPresenter implements ReposContract.Presenter {

    private final GitHubRepository mGitHubRepository;
    private ReposContract.View mView;

    public ReposPresenter(GitHubRepository gitHubRepository) {
        mGitHubRepository = gitHubRepository;
    }

    @Override
    public void setView(ReposContract.View view) {
        mView = view;
    }

    @Override
    public void loadRepos(String credential) {
        mGitHubRepository.getRepos(credential)
                .subscribe(repos -> {
                    mView.setupRepos(repos);
                }, error -> {
                    mView.showError(error.getMessage());
                });

    }
}