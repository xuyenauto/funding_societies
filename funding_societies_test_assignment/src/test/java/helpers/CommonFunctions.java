package helpers;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class CommonFunctions {

    public static String getCurrentDate(String format){
        String date;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        date = formatter.format(calendar.getTime());
        System.out.println(" Current date " + date);
        return date;
    }

}
