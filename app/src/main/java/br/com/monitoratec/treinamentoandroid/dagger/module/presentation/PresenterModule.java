package br.com.monitoratec.treinamentoandroid.dagger.module.presentation;

import br.com.monitoratec.treinamentoandroid.dagger.scope.PerActivity;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubOAuthRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubStatusRepository;
import br.com.monitoratec.treinamentoandroid.presentation.ui.auth.AuthContract;
import br.com.monitoratec.treinamentoandroid.presentation.ui.auth.AuthPresenter;
import dagger.Module;
import dagger.Provides;

/**
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
}