package demo.showcase.twitterfeed.network.interceptors;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.Locale;

import demo.showcase.twitterfeed.network.service.TwitterService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.Assert.*;

/**
 * Created by leslied on 08/04/2018.
 */
public class AuthInterceptorTest {

    private MockWebServer mockWebServer;

    @Before
    public void createService() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();
    }

    @After
    public void stopService() throws IOException {
        mockWebServer.shutdown();
    }

    private static final String EXPECTED_TOKEN = "Dummy Auth Token";
    @Test
    public void AuthIntercepter_Token_AuthorizationHeader() throws Exception {


        mockWebServer.enqueue(new MockResponse());

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addInterceptor(new AuthInterceptor(EXPECTED_TOKEN)).build();
        okHttpClient.newCall(new Request.Builder().url(mockWebServer.url("/")).build()).execute();

        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals(EXPECTED_TOKEN, request.getHeader("Authorization"));
    }

}