package demo.showcase.twitterfeed.network.converters;

import android.content.Context;

import org.junit.After;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;

/**
 * Created by leslied on 08/04/2018.
 */
public class DateConverterTest {
    private final static String SRC_DATE = "Thu Apr 05 09:36:58 +0000 2018";
    private final static String TEST_DATE = "Apr 05 2018 Thu 10:36:58";

    private final DateFormat mockFormat = mock(DateFormat.class);

    @After
    public void tearDown() {
        reset(mockFormat);
    }

    @Test
    public void Date_valid_LocalString() throws Exception {
        String localString = DateConverter.DateFormatter( SRC_DATE);
        assertThat(TEST_DATE, is(localString));
    }


    @Test
    public void Date_Invalid_IOException() throws ParseException {



    }

}