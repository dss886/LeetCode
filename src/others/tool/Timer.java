package others.tool;

import java.util.Date;

/**
 * Created by dss886 on 2016/5/15.
 */
public class Timer {
    private static long startTime = -1;

    public static void start() {
        startTime = new Date().getTime();
    }

    public static void stop() {
        long cost = new Date().getTime() - startTime;
        Printer.p("Time Cost: " + cost + " ms");
    }
}
