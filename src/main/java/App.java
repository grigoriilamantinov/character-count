import cache.Cache;
import cache.CounterCharCache;
import counter.Counter;
import counter.CounterCharText;
import facade.CharCounterFacade;
import formatter.Formatter;
import formatter.ResultFormatter;

public class App {
    public static void main(String[] args) {

        Counter counter = new CounterCharText();
        Cache cache = new CounterCharCache();
        Formatter resultFormatter = new ResultFormatter();
        CharCounterFacade facade = new CharCounterFacade(cache, counter, resultFormatter);
        facade.run();
    }
}

