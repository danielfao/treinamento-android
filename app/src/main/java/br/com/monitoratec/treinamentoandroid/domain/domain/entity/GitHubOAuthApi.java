package br.com.monitoratec.treinamentoandroid.domain.domain.entity;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Interface da API GitHub Status.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubOAuthApi {
    String BASE_URL = "https://github.com/login/oauth/";

    Retrofit RETROFIT = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build();

    @Headers({"Accept: application/json"})
    @FormUrlEncoded
    @POST("access_token")
    Call<AccessToken> accessToken(
            @Field("client_id") String clientId,
            @Field("client_secret") String clientSecret,
            @Field("code") String code);
}
