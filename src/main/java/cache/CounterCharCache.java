package cache;

import java.util.HashMap;
import java.util.Map;

public class CounterCharCache implements Cache {

    private Map<String, String> cache = new HashMap<>();

    @Override
    public void put (String letter, String formattedResult) {
        cache.put(letter, formattedResult);
    }

    @Override
    public String get(String sourceString) {
        return  cache.get(sourceString);
    }

    @Override
    public boolean contains(String sourceString) {
        return cache.containsKey(sourceString);
    }
}
