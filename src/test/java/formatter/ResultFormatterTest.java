package formatter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ResultFormatterTest {

    @Test
    void formatResult() {
        ResultFormatter formatter = new ResultFormatter();
        Map<Character, Integer> map = new HashMap<>();
        map.put('B', 1);
        String expectedResult = "Символ: B - встречается: 1";

        var actualResult = formatter.formatResult(map);
        assertEquals(expectedResult, actualResult);
    }
}