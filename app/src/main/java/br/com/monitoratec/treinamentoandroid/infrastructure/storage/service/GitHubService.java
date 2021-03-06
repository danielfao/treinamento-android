package br.com.monitoratec.treinamentoandroid.infrastructure.storage.service;

import java.util.List;

import br.com.monitoratec.treinamentoandroid.domain.entity.Repo;
import br.com.monitoratec.treinamentoandroid.domain.entity.User;
import retrofit2.http.GET;
import retrofit2.http.Header;
import rx.Observable;

/**
 * Interface Retrofit from API GitHub.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubService {

    String BASE_URL = "https://api.github.com/";

    @GET("user")
    Observable<User> getUser(@Header("Authorization") String credential);

    @GET("user/repos")
    Observable<List<Repo>> getRepos(@Header("Authorization") String credential);
}
