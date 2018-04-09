package demo.showcase.twitterfeed.core.presenters;

import java.util.List;

import demo.showcase.twitterfeed.core.model.TwitterPost;

/**
 * Created by leslied on 07/04/2018.
 */

public interface MainActivityPresenter {
    interface View{
        void onPostData(List<TwitterPost> postData);
        void onFetchPostDataError(String errorText);

        void showProgress();
        void hideProgress();
    }

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void fetchPostData(String listId, String tweetMode, int entities, int recordCount);
}
