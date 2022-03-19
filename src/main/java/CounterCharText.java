import java.util.*;

public class CounterCharText {
    public Map<Character, Integer> counterCharacters(String inputText) {
        char[] inputCharacters = inputText.toCharArray();

        Set<Character> uniqueCharSet = new HashSet<>();
        for (Character letter : inputCharacters) {
            uniqueCharSet.add(letter);
        }

        Map<Character, Integer> countedLetters = new HashMap<>();
        int counterOfUniqueCases = 0;
        for (char uniqueLetter : uniqueCharSet) {
            for (char unUniqueLetter : inputCharacters) {
                if (unUniqueLetter == uniqueLetter) {
                    counterOfUniqueCases++;
                }
            }
            countedLetters.put(uniqueLetter, counterOfUniqueCases);
            counterOfUniqueCases = 0;
        }
        return countedLetters;
    }
}