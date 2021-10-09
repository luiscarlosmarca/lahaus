package util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.time.temporal.TemporalUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FitTime {
    static Boolean allMessagesProcessed = true;
    static TemporalUnit unit;
    String name="temp";

    private FitTime() {
    }

    public static Callable<Boolean> succefull() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return allMessagesProcessed;
            }
        };

    }


}