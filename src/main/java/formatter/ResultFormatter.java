package formatter;

import java.util.Map;
import java.util.StringJoiner;

public class ResultFormatter implements Formatter {

    @Override
    public String formatResult (Map<Character, Integer> map) {
        StringJoiner joiner = new StringJoiner("\n");

        for (Map.Entry<Character, Integer> result : map.entrySet()) {
            joiner.add("Символ: " + result.getKey() + " - встречается: " + result.getValue());
        }
        return joiner.toString();
    }
}
