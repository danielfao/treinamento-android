package br.com.monitoratec.treinamentoandroid.dagger.module.presentation;

import br.com.monitoratec.treinamentoandroid.dagger.scope.PerActivity;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubOAuthRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubStatusRepository;
import br.com.monitoratec.treinamentoandroid.presentation.ui.auth.AuthContract;
import br.com.monitoratec.treinamentoandroid.presentation.ui.auth.AuthPresenter;
import br.com.monitoratec.treinamentoandroid.presentation.ui.repos.ReposContract;
import br.com.monitoratec.treinamentoandroid.presentation.ui.repos.ReposPresenter;
import dagger.Module;
import dagger.Provides;

/**
 *
 * Module for presenters.
 *
 * Created by danifao on 2017-01-13.
 */

@Module
public class PresenterModule {

    @PerActivity
    @Provides
    AuthContract.Presenter provideMainPresenter(
            GitHubRepository gitHubRepository,
            GitHubStatusRepository gitHubStatusRepository,
            GitHubOAuthRepository gitHubOAuthRepository) {
        return new AuthPresenter(gitHubRepository,
                gitHubStatusRepository,
                gitHubOAuthRepository);
    }

    @PerActivity
    @Provides
    ReposContract.Presenter providesResposPresenter(GitHubRepository gitHubRepository) {
        return new ReposPresenter(gitHubRepository);
    }
}