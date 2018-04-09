package demo.showcase.twitterfeed.di.ui;

import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import demo.showcase.twitterfeed.di.FeedApplicationScope;
import demo.showcase.twitterfeed.ui.adapters.FeedRecyclerViewAdapter;

/**
 * Created by leslied on 08/04/2018.
 */
@Module
public class FeedAdapterModule {
    @Provides
    @FeedApplicationScope
    public FeedRecyclerViewAdapter feedRecyclerViewAdapter(Picasso picasso) {
        return new FeedRecyclerViewAdapter(picasso);
    }
}
