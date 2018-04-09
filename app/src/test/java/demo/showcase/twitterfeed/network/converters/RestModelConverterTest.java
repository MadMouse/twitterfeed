package demo.showcase.twitterfeed.network.converters;

import org.junit.Test;

import java.text.DateFormat;
import java.util.Calendar;

import demo.showcase.twitterfeed.core.model.TwitterPost;
import demo.showcase.twitterfeed.network.NetworkTestUtils;
import demo.showcase.twitterfeed.network.model.Response;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by leslied on 08/04/2018.
 */
public class RestModelConverterTest {


    private final String EXPECTED_PROFILE_URL = "http://pbs.twimg.com/profile_images/948583274246492160/ZripPk3i_normal.jpg";
    private final String EXPECTED_CREATED_DATE = "Thu Apr 05 09:36:58 +0000 2018";
    private final String EXPECTED_FULL_TEXT = "#ANDTech100 Day 66 - A #TBT to our blog Blockchain – Differences between Ethereum and Hyperledger Fabric\n\nhttps://t.co/L4iCltZTmg https://t.co/0Yrcj4RUWl";

    @Test
    public void response_To_Post() throws Exception {
        Response networkPost = NetworkTestUtils.getPost();

        TwitterPost corePost = RestModelConverter.convertToCoreModel(networkPost);


        assertThat(EXPECTED_CREATED_DATE,is(corePost.getCreatedAt()));

        assertThat(EXPECTED_PROFILE_URL,is(corePost.getProfile_image_url()));

        assertThat(EXPECTED_FULL_TEXT,is(corePost.getFull_text()));



    }

}