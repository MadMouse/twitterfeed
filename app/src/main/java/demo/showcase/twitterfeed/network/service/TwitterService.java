package demo.showcase.twitterfeed.network.service;

import java.util.List;

import demo.showcase.twitterfeed.network.model.Response;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by leslied on 07/04/2018.
 */

public interface TwitterService {

    @GET("1.1/lists/statuses.json")
    Observable<List<Response>> fetchPublicPosts(@Query("list_id") String listId,
                                                @Query("tweet_mode") String tweetMode,
                                                @Query("include_entities") Integer includeEntities,
                                                @Query("count") Integer count);
}
