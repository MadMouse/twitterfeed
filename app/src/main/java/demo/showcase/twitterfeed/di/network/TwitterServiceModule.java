package demo.showcase.twitterfeed.di.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import demo.showcase.twitterfeed.di.FeedApplicationScope;
import demo.showcase.twitterfeed.network.service.TwitterService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by leslied on 07/04/2018.
 */
@Module(includes = NetworkModule.class)
public class TwitterServiceModule {

    @Provides
//    @FeedApplicationScope
    public TwitterService getTwitterService(Retrofit twitterRetrofit) {
        return twitterRetrofit.create(TwitterService.class);
    }

    @Provides
//    @FeedApplicationScope
    public Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
//    @FeedApplicationScope
    public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .baseUrl("https://api.twitter.com")
                .build();
    }
}
