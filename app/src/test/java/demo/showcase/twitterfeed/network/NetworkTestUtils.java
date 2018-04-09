package demo.showcase.twitterfeed.network;

import com.google.gson.Gson;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import demo.showcase.twitterfeed.network.model.Response;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by leslied on 08/04/2018.
 */

public class NetworkTestUtils {

    private final String EXPECTED_ID_STR = "981828031865114624";
    private final String EXPECTED_CREATED_DATE = "Thu Apr 05 09:36:58 +0000 2018";

    public static Response getPost() throws IOException {
        Gson gson = new Gson();

        BufferedReader streamReader = new BufferedReader(new InputStreamReader(NetworkTestUtils.class.getResource("/raw/feeditem.json").openStream()));
        Response networkPost = gson.fromJson(streamReader, Response.class);
        return networkPost;
    }

    @Test
    public void Response_DeSerialization_Test() throws IOException {
        Response response = getPost();

        assertThat(EXPECTED_CREATED_DATE,is(response.getCreatedAt()));

        assertThat(EXPECTED_ID_STR,is(response.getIdStr()));

    }


    public static List<Response> getPosts() throws IOException {
        Gson gson = new Gson();

        BufferedReader streamReader = new BufferedReader(new InputStreamReader(NetworkTestUtils.class.getResource("/raw/feedlist.json").openStream()));
        Response[] networkPosts = gson.fromJson(streamReader, Response[].class);
        return new ArrayList<>(Arrays.asList(networkPosts));
    }

    @Test
    public void ResponseArray_DeSerialization_Test() throws IOException {
        List<Response> responses = getPosts();

        assertThat(responses.size(), is(10));
    }


}
