import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CounterCharText {
    public void counterCharacters(String inputText) {
        char[] inputCharacters = inputText.toCharArray();

        Set<Character> uniqueCharSet = new HashSet<>();
        for (Character letter : inputCharacters) {
            uniqueCharSet.add(letter);
        }

        Map<Character, Integer> countedLetters = new HashMap<>();
        int counterOfUniqueCases = 0;
        for (char uniqueletter : uniqueCharSet ) {
            for (char unUniuqeletter : inputCharacters){
                if (unUniuqeletter == uniqueletter) {
                    counterOfUniqueCases++;
                }
            }
            countedLetters.put(uniqueletter, counterOfUniqueCases);
            counterOfUniqueCases = 0;
        }
        System.out.println(countedLetters);
    }
//    public void countWithArrayOnly(char[] charSourceArray) {
//        int uniqueArrayIndex = 0;
//        char[] uniqueArray = new char[charSourceArray.length];
//        for (char element : charSourceArray) {
//
//            int meetingCounter = 0;
//            int uniqueMark = 0;
//
//            uniqueArray[uniqueArrayIndex] = element;
//
//            for (int i = 0; i < charSourceArray.length; i++) {
//                if (element == charSourceArray[i]) {
//                    meetingCounter++;
//                }
//            }
//
//            for (int i = 0; i < uniqueArrayIndex + 1; i++) {
//                if (element == uniqueArray[i]) {
//                    uniqueMark++;
//                }
//            }
//
//            if (uniqueMark == 1) {
//                System.out.println(charSourceArray[uniqueArrayIndex] + " : " + meetingCounter);
//            }
//            uniqueArrayIndex++;
//        }
//    }


//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
}
