import java.util.Map;

public class ResultFormatting {
    public void printResult (Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> result : map.entrySet()) {
            System.out.println("Символ: " + result.getKey() + " - встречается: " + result.getValue());
        }
    }
}
