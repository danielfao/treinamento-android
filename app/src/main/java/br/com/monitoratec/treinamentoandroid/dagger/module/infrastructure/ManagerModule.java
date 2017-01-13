package br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure;

import javax.inject.Singleton;

import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubOAuthRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubRepository;
import br.com.monitoratec.treinamentoandroid.domain.repository.GitHubStatusRepository;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.manager.GitHubManager;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.manager.GitHubOAuthManager;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.manager.GitHubStatusManager;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.service.GitHubOAuthService;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.service.GitHubService;
import br.com.monitoratec.treinamentoandroid.infraestructure.storage.service.GitHubStatusService;
import dagger.Module;
import dagger.Provides;

/**
 * Created by danifao on 2017-01-13.
 */

@Module
public class ManagerModule {

    @Singleton
    @Provides
    GitHubRepository providesGitHubRepository(
            GitHubService gitHubService) {
        return new GitHubManager(gitHubService);
    }

    @Singleton
    @Provides
    GitHubStatusRepository providesGitHubStatusRepository(
            GitHubStatusService gitHubStatusService) {
        return new GitHubStatusManager(gitHubStatusService);
    }

    @Singleton
    @Provides
    GitHubOAuthRepository providesGitHubOAuthRepository(
            GitHubOAuthService gitHubOAuthService) {
        return new GitHubOAuthManager(gitHubOAuthService);
    }
}