package br.com.monitoratec.treinamentoandroid.domain.domain;

import com.google.gson.GsonBuilder;

import br.com.monitoratec.treinamentoandroid.domain.domain.entity.Status;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Interface da API GitHub Status.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubStatusApi {

    String BASE_URL = "https://status.github.com/api/";

    Retrofit RETROFIT = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(
                    // 2012-12-07T18:11:55Z
                    new GsonBuilder()
                            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
                            .create()))
            .baseUrl(BASE_URL)
            .build();

    @GET("last-message.json")
    Call<Status> lastMessage();
}
