package demo.showcase.twitterfeed.core.presenters.impl;

import android.support.annotation.NonNull;

import javax.inject.Inject;

import demo.showcase.twitterfeed.core.presenters.MainActivityPresenter;
import demo.showcase.twitterfeed.network.service.TwitterService;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

import static demo.showcase.twitterfeed.network.converters.RestModelConverter.convertToCoreModelList;

/**
 * Created by leslied on 08/04/2018.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private TwitterService twitterService;
    private View presenterView;

    @Inject
    public MainActivityPresenterImpl(@NonNull TwitterService twitterService,@NonNull MainActivityPresenter.View presenterView){

        this.twitterService = twitterService;
        this.presenterView = presenterView;
    }

    @Override
    public void onCreate() {


    }

    @Override
    public void onDestroy() {
        compositeDisposable.clear();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void fetchPostData( String listId, String tweetMode, int entities, int recordCount) {
        presenterView.showProgress();
        compositeDisposable.add(

                twitterService.fetchPublicPosts(listId, tweetMode,entities,recordCount)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(
                                feedList -> {
                                    presenterView.onPostData(convertToCoreModelList(feedList));
                                    presenterView.hideProgress();
                                },
                                throwable -> {
                                    presenterView.hideProgress();
                                    presenterView.onFetchPostDataError(throwable.getMessage());

                                }));

    }
}
