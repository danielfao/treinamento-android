package br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure;

import javax.inject.Named;
import javax.inject.Singleton;

import br.com.monitoratec.treinamentoandroid.infrastructure.storage.service.GitHubOAuthService;
import br.com.monitoratec.treinamentoandroid.infrastructure.storage.service.GitHubService;
import br.com.monitoratec.treinamentoandroid.infrastructure.storage.service.GitHubStatusService;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import static br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure.NetworkModule.RETROFIT_GITHUB;
import static br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure.NetworkModule.RETROFIT_GITHUB_OAUTH;
import static br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure.NetworkModule.RETROFIT_GITHUB_STATUS;

/**
 *
 * Module for services (Retrofit interfaces).
 *
 * Created by danifao on 2017-01-12.
 */

@Module
public class ServiceModule {

    @Singleton
    @Provides
    GitHubService providesGitHub(@Named(RETROFIT_GITHUB) Retrofit retrofit) {
        return retrofit.create(GitHubService.class);
    }

    @Singleton
    @Provides
    GitHubStatusService providesGitHubStatus(@Named(RETROFIT_GITHUB_STATUS) Retrofit retrofit) {
        return retrofit.create(GitHubStatusService.class);
    }

    @Singleton
    @Provides
    GitHubOAuthService providesGitHubOAuth(@Named(RETROFIT_GITHUB_OAUTH) Retrofit retrofit) {
        return retrofit.create(GitHubOAuthService.class);
    }
}