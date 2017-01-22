package br.com.monitoratec.treinamentoandroid.domain.repository;

import java.util.List;

import br.com.monitoratec.treinamentoandroid.domain.entity.User;
import br.com.monitoratec.treinamentoandroid.domain.entity.Repo;
import rx.Observable;


/**
 * Repository Interface from API GitHub.
 *
 * Created by danifao on 2017-01-13.
 */

public interface GitHubRepository {

    Observable<User> getUser(String credential);
    Observable<List<Repo>> getRepos(String credential);
}
