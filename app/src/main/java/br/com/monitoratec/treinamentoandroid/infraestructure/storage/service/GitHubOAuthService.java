package br.com.monitoratec.treinamentoandroid.infraestructure.storage.service;

import br.com.monitoratec.treinamentoandroid.domain.entity.AccessToken;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Interface Retrofit from API GitHub OAuth.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubOAuthService {
    String BASE_URL = "https://github.com/login/oauth/";

    @Headers({"Accept: application/json"})
    @FormUrlEncoded
    @POST("access_token")
    Observable<AccessToken> getAccessToken(
            @Field("client_id") String clientId,
            @Field("client_secret") String clientSecret,
            @Field("code") String code);
}
