package demo.showcase.twitterfeed.di.network;

import android.content.Context;

import java.io.File;

import dagger.Module;
import dagger.Provides;
import demo.showcase.twitterfeed.di.ApplicationContext;
import demo.showcase.twitterfeed.di.ContextModule;
import demo.showcase.twitterfeed.di.FeedApplicationScope;
import demo.showcase.twitterfeed.network.interceptors.AuthInterceptor;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import timber.log.Timber;

@Module(includes = ContextModule.class)
public class NetworkModule {

    @Provides
    @FeedApplicationScope
    public HttpLoggingInterceptor loggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Timber.i(message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return interceptor;
    }

    @Provides
    @FeedApplicationScope
    public AuthInterceptor authInterceptor() {
        //TODO LHD Retrieve Token from Secure Store to be implemented.
        final String TEMP_TOKEN = "Bearer AAAAAAAAAAAAAAAAAAAAAONnAAAAAAAA9%2BRnvvURlJvqJcLyf%2F1gzN7Soi4%3D0fsF0G3lopYYkpBgUsMnwJFPyfrDgJdjrbuNugMlJzEinzInjc";
        AuthInterceptor interceptor = new AuthInterceptor(TEMP_TOKEN);
        return interceptor;
    }

    @Provides
    @FeedApplicationScope
    public Cache cache(File cacheFile) {
        return new Cache(cacheFile, 10 * 1000 * 1000); //10MB  Cahe
    }

    @Provides
    @FeedApplicationScope
    public File cacheFile(@ApplicationContext Context context) {
        return new File(context.getCacheDir(), "okhttp_cache");
    }

    @Provides
    @FeedApplicationScope
    public OkHttpClient okHttpClient(HttpLoggingInterceptor loggingInterceptor, AuthInterceptor authInterceptor, Cache cache) {
        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(authInterceptor)
                .cache(cache)
                .build();
    }
}
