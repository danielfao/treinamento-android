package br.com.monitoratec.treinamentoandroid.domain.repository;

import br.com.monitoratec.treinamentoandroid.domain.entity.Status;
import rx.Observable;

/**
 * Repository Interface from API GitHub Status.
 *
 * Created by danifao on 2017-01-13.
 */

public interface GitHubStatusRepository {

    Observable<Status> getLastStatus();
}
