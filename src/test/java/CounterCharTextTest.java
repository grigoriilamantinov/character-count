import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CounterCharTextTest {
    CounterCharText counter = new CounterCharText();

    @Test
    void shouldCountCharAndPutTheValuesInTheMap() {
        String str = "B!!";
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put((char) 66, 1);
        expectedResult.put((char) 33, 2);
        Map<Character, Integer> actualResult = counter.counterCharacters(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void cashCheck() {
        Map<String, Map<Character, Integer>> cash = new HashMap<>();
        String str = "B!!";
        Map<Character, Integer> map = new HashMap<>();
        map.put((char) 66, 1);
        map.put((char) 33, 2);
        cash.put("B!!", map);
        boolean expectedResult = true;
        counter.cashCheck(str);
        boolean actualResult = counter.cashCheck(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void cashGet() {
        Map<String, Map<Character, Integer>> cash = new HashMap<>();
        String str = "B!!";
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put((char) 66, 1);
        expectedResult.put((char) 33, 2);
        counter.cashCheck(str);
        Map<Character, Integer> actualResult = counter.cashGet(str);

        assertEquals(expectedResult, actualResult);
    }
}