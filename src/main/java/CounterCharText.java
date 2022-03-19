import java.util.*;

public class CounterCharText {

    Map<String, Map<Character, Integer>> cash = new HashMap<>();

    public Map<Character, Integer> counterCharacters(String inputText) {
        char[] inputCharacters = inputText.toCharArray();

        Set<Character> uniqueCharSet = new HashSet<>();
        for (Character letter : inputCharacters) {
            uniqueCharSet.add(letter);
        }

        Map<Character, Integer> countedLetters = new HashMap<>();
        int counterOfUniqueCases = 0;
        for (char uniqueletter : uniqueCharSet) {
            for (char unUniuqeletter : inputCharacters) {
                if (unUniuqeletter == uniqueletter) {
                    counterOfUniqueCases++;
                }
            }
            countedLetters.put(uniqueletter, counterOfUniqueCases);
            counterOfUniqueCases = 0;
        }
        return countedLetters;
    }

    public boolean cashCheck(String inputText) {

        boolean cashCheck = cash.containsKey(inputText);
        cash.put(inputText, counterCharacters(inputText));
        return cashCheck;
    }

    public Map<Character, Integer> cashGet(String inputText){
        return cash.get(inputText);
    }
}