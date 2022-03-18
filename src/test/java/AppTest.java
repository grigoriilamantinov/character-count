import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void shouldCountCharAndPutTheValuesInTheMap() {
        CounterCharText counter = new CounterCharText();
        String str = "B!!";
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put((char) 66, 1);
        expectedResult.put((char) 33, 2);
        Map<Character, Integer> actualResult = counter.counterCharacters(str);

        assertEquals(expectedResult, actualResult);
    }
}
