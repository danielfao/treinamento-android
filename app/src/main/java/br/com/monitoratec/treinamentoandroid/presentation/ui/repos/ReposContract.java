package br.com.monitoratec.treinamentoandroid.presentation.ui.repos;

import java.util.List;

import br.com.monitoratec.treinamentoandroid.domain.entity.Repo;

/**
 * GitHub list {@link Repo} MVP contract.
 *
 * Created by danifao on 2017-01-22.
 */

public interface ReposContract {
    interface View {
        void setupRepos(List<Repo> repos);

        void startNewRepoActivity();

        void showError(String message);
    }

    interface Presenter {
        void setView(ReposContract.View view);

        void loadRepos(String credential);
    }
}