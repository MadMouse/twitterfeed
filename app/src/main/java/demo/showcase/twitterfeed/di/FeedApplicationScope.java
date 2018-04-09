package demo.showcase.twitterfeed.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by leslied on 07/04/2018.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface FeedApplicationScope {
}
