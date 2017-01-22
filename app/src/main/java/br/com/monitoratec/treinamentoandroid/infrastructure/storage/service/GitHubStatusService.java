package br.com.monitoratec.treinamentoandroid.infrastructure.storage.service;

import br.com.monitoratec.treinamentoandroid.domain.entity.Status;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Interface Retrofit from API GitHub Status.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubStatusService {

    String BASE_URL = "https://status.github.com/api/";

    @GET("last-message.json")
    Observable<Status> getLastStatus();
}
