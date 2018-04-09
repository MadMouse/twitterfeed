package demo.showcase.twitterfeed.network.converters;

import android.content.Context;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leslied on 08/04/2018.
 */

public class DateConverter {

    private static SimpleDateFormat inSimpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
    private static SimpleDateFormat outSimpleDateFormat = new SimpleDateFormat("MMM dd yyyy EEE HH:mm:ss");
    public static String DateFormatter(String networkDate) throws ParseException {
        Date date = inSimpleDateFormat.parse(networkDate);
        return outSimpleDateFormat.format(date);
    }

}
