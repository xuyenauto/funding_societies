package helpers;

import org.apache.log4j.Logger;


public class Log {

    private static final Logger Log = Logger.getLogger(Log.class.getName());

    public static void info(String message)
    {
        Log.info(message);
    }

    public static void error(String message)
    {
        Log.error(message);
    }
}
