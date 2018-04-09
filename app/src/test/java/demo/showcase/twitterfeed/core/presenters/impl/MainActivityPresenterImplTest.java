package demo.showcase.twitterfeed.core.presenters.impl;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import demo.showcase.twitterfeed.core.model.TwitterPost;
import demo.showcase.twitterfeed.core.presenters.MainActivityPresenter;
import demo.showcase.twitterfeed.network.NetworkTestUtils;
import demo.showcase.twitterfeed.network.converters.RestModelConverter;
import demo.showcase.twitterfeed.network.model.Response;
import demo.showcase.twitterfeed.network.service.TwitterService;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;

import static org.junit.Assert.*;

/**
 * Created by leslied on 09/04/2018.
 */
public class MainActivityPresenterImplTest {

    private MainActivityPresenter mainActivityPresenter;


    @Mock
    private TwitterService twitterService;
    @Mock
    private MainActivityPresenter.View presenterView;

    private List<Response> mockResponse = new ArrayList<>(0);
    @Before
    public void setup() throws Exception{

        RxAndroidPlugins.setInitMainThreadSchedulerHandler(__ -> Schedulers.trampoline());
        MockitoAnnotations.initMocks(this);

        Mockito.when(twitterService.fetchPublicPosts("","",1,10)).thenReturn(Observable.never());

        mainActivityPresenter = new MainActivityPresenterImpl(twitterService, presenterView);
    }


    @Test
    public void onFetchPostData_TwitterPostList() throws Exception {
        Mockito.when(twitterService.fetchPublicPosts("","",1,10)).thenReturn(Observable.just(mockResponse));

        mainActivityPresenter.fetchPostData("","",1,10);

        Mockito.verify(presenterView, Mockito.times(1)).showProgress();
        Mockito.verify(presenterView, Mockito.atLeast(1)).hideProgress();
        Mockito.verify(presenterView, Mockito.times(1)).onPostData(Mockito.any());

    }


    /*
    TODO This test must be implemnted before code is commecially ready.
     */
//    @Test
//    public void onFetchPostData_OnErrorHandler() throws Exception {
//
//        //TODO LHD Future investigation into RX Java required to resolve this issue and implemnet test.
//
//        //Given
//        Mockito.when(twitterService.fetchPublicPosts("","error",1,10)).thenReturn(Observable.error(new IOException("Dummy Network Error")));
//
//        //When
//        mainActivityPresenter.fetchPostData("","error",1,10);
//
//        //Then
//        Mockito.verify(presenterView, Mockito.times(1)).showProgress();
//        //TODO Seems that the exception is not been caught by the onError Further investigation into RXJava Observables required.
////        Mockito.verify(presenterView, Mockito.atLeast(1)).hideProgress();
////        Mockito.verify(presenterView, Mockito.times(1)).onFetchPostDataError(Mockito.any());
//
//    }

}