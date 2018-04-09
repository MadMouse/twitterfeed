package demo.showcase.twitterfeed;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import demo.showcase.twitterfeed.di.ContextModule;
import demo.showcase.twitterfeed.di.DaggerFeedApplicationComponent;
import demo.showcase.twitterfeed.di.FeedApplicationComponent;
import timber.log.Timber;

/**
 * Created by leslied on 08/04/2018.
 */

public class FeedApplication extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    FeedApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        component = DaggerFeedApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        component.inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
