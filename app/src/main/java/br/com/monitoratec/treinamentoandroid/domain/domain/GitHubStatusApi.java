package br.com.monitoratec.treinamentoandroid.domain.domain;

import br.com.monitoratec.treinamentoandroid.domain.domain.entity.Status;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Interface da API GitHub Status.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubStatusApi {

    String BASE_URL = "https://status.github.com/api/";

    @GET("last-message.json")
    Observable<Status> lastMessage();
}
