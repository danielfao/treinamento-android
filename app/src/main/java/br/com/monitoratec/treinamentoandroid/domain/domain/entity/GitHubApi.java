package br.com.monitoratec.treinamentoandroid.domain.domain.entity;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import rx.Observable;

/**
 * Interface da API GitHub Status.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubApi {

    String BASE_URL = "https://api.github.com/";

    Retrofit RETROFIT = new Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build();

    @GET("user")
    Observable<User> basicAuth(@Header("Authorization") String credential);
}
