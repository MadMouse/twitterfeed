package demo.showcase.twitterfeed.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import demo.showcase.twitterfeed.ui.activity.MainActivity;

/**
 * Created by leslied on 08/04/2018.
 */
@Module
public abstract class FeedApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
