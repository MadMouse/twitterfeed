package demo.showcase.twitterfeed.ui.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import demo.showcase.twitterfeed.R;
import demo.showcase.twitterfeed.core.model.TwitterPost;
import demo.showcase.twitterfeed.core.presenters.MainActivityPresenter;
import demo.showcase.twitterfeed.core.presenters.impl.MainActivityPresenterImpl;
import demo.showcase.twitterfeed.network.service.TwitterService;
import demo.showcase.twitterfeed.ui.adapters.FeedRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {

    //TODO LHD this hardcoded for demo but should be retrieved from sever or seccure store.
    private static String TEMP_LISTID = "871746761387323394";
    private static String TEMP_TWEETMODE = "extended";
    private static int TEMP_ENTITIES = 0;
    private static int TEMP_RECORDCOUNT = 10;


    @BindView(R.id.feedListRefresh)
    SwipeRefreshLayout feedListRefresh;

    @BindView(R.id.feedList)
    RecyclerView feedList;

    @Inject
    FeedRecyclerViewAdapter adapter;

    @Inject
    Picasso picasso;

    @Inject
    TwitterService twitterService;

    MainActivityPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        mainPresenter = new MainActivityPresenterImpl(twitterService, this);

        feedListRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mainPresenter.fetchPostData(TEMP_LISTID, TEMP_TWEETMODE, TEMP_ENTITIES, TEMP_RECORDCOUNT);
            }
        });

        //TODO LHD Fetch inital data - Screen Orientaton handling to be implmented.
        feedListRefresh.post(new Runnable() {
            @Override public void run() {
                mainPresenter.fetchPostData(TEMP_LISTID, TEMP_TWEETMODE, TEMP_ENTITIES, TEMP_RECORDCOUNT);
            }
        });

        feedList.setLayoutManager(new LinearLayoutManager(this));
        feedList.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.onResume();
    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onPostData(List<TwitterPost> postData) {
        adapter.updateDataset(postData);
    }

    @Override
    public void onFetchPostDataError(String errorText) {
        Toast.makeText(this,errorText, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgress() {
        feedListRefresh.setEnabled(true);
    }

    @Override
    public void hideProgress() {
        feedListRefresh.setEnabled(false);
    }
}
