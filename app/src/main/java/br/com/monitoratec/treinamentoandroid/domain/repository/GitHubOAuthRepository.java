package br.com.monitoratec.treinamentoandroid.domain.repository;

import br.com.monitoratec.treinamentoandroid.domain.entity.AccessToken;
import rx.Observable;

/**
 * Repository Interface from API GitHub OAuth.
 *
 * Created by danifao on 2017-01-13.
 */

public interface GitHubOAuthRepository {

    Observable<AccessToken> getAccessToken(String clientId, String clientSecret, String code);
}
