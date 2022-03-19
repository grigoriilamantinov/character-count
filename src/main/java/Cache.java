import java.util.HashMap;
import java.util.Map;

public class Cache {

    Map<String, String> cache = new HashMap<>();

    public void put (String letter, String formattedResult) {
        cache.put(letter, formattedResult);
    }

    public String get(String sourceString) {
        return  cache.get(sourceString);
    }

    public boolean contains(String sourceString) {
        return cache.containsKey(sourceString);
    }
}
