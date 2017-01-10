package domain;

import domain.entity.Status;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Interface da API GitHub Status.
 *
 * Created by danifao on 2017-01-09.
 */

public interface GitHubStatusApi {

    String BASE_URL = "https://status.github.com/api/";

    @GET("last-message.json")
    Call<Status> lastMessage();
}
