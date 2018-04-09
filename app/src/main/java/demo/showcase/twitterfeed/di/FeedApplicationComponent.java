package demo.showcase.twitterfeed.di;

import com.squareup.picasso.Picasso;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import demo.showcase.twitterfeed.FeedApplication;
import demo.showcase.twitterfeed.di.network.TwitterServiceModule;
import demo.showcase.twitterfeed.di.ui.PicassoModule;
import demo.showcase.twitterfeed.network.service.TwitterService;

/**
 * Created by leslied on 08/04/2018.
 */
@FeedApplicationScope
@Component(modules = { AndroidInjectionModule.class, FeedApplicationModule.class, PicassoModule.class, TwitterServiceModule.class})
public interface FeedApplicationComponent extends AndroidInjector<FeedApplication> {

    Picasso getPicasso();
    TwitterService getTwitterService();
}
