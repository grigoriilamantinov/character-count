package counter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CounterCharTextTest {
    CounterCharText counter = new CounterCharText();

    @Test
    void shouldCountCharAndReturnValues() {
        String str = "B!!";
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('B', 1);
        expectedResult.put('!', 2);
        Map<Character, Integer> actualResult = counter.counterCharacters(str);

        assertEquals(expectedResult, actualResult);
    }


}