package demo.showcase.twitterfeed.ui.adapters;

import android.support.test.espresso.DataInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.google.gson.Gson;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import demo.showcase.twitterfeed.network.converters.RestModelConverter;
import demo.showcase.twitterfeed.network.model.Response;
import demo.showcase.twitterfeed.ui.activity.MainActivity;

import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.*;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;

/**
 * Created by leslied on 08/04/2018.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class FeedRecyclerViewAdapterTest {

    private static final String ITEM_01_DATE = "Thu Apr 05 09:36:58 +0000 2018";

    // Match the last item by matching its text.
    private static final String LAST_ITEM_DATE = "Sun Mar 25 19:33:12 +0000 2018";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    public static List<Response> getPosts() throws IOException {
        Gson gson = new Gson();

        BufferedReader streamReader = new BufferedReader(new InputStreamReader(FeedRecyclerViewAdapterTest.class.getResource("/raw/feedlist.json").openStream()));
        Response[] networkPosts = gson.fromJson(streamReader, Response[].class);
        return new ArrayList<>(Arrays.asList(networkPosts));
    }

    @Before
    public void beforeTest(){
        try {
            mActivityRule.getActivity().onPostData(RestModelConverter.convertToCoreModelList(getPosts()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void list_lastItem_NotDisplayed() {

        onView(withText(LAST_ITEM_DATE)).check(doesNotExist());
    }

    @Test
    public void list_firstItem_Displayed() {
        onView(withText(ITEM_01_DATE)).check(matches(isCompletelyDisplayed()));
    }

//    /**
//     * Check that the item is created. onData() takes care of scrolling.
//     */
//    @Test
//    public void list_Scrolls() {
//        onRow(LAST_ITEM_DATE).check(matches(isCompletelyDisplayed()));
//    }
//
//    private static DataInteraction onRow(String str) {
//        return onData(hasEntry(equalTo(MainActivity.ROW_TEXT), is(str)));
//    }
}