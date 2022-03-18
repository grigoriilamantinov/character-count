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
        for (char uniqueletter : uniqueCharSet ) {
            for (char unUniuqeletter : inputCharacters){
                if (unUniuqeletter == uniqueletter) {
                    counterOfUniqueCases++;
                }
            }
            countedLetters.put(uniqueletter, counterOfUniqueCases);
            counterOfUniqueCases = 0;
        }
        return countedLetters;
    }

    public void printResult (Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> result : map.entrySet()) {
            System.out.println("Символ: " + result.getKey() + " - встречается: " + result.getValue());
        }
    }

    public void activateCounter() {
        CounterCharText stats = new CounterCharText();
        Scanner sc = new Scanner(System.in);
        System.out.print("Добро пожаловать в счётчик символов!\nВведите свою строку: ");
        String inputText = sc.nextLine();

        boolean isDone = false;
        Map<String, Map<Character, Integer>> cash = new HashMap<>();

        while (!isDone) {
            if (cash.containsKey(inputText)) {
                System.out.println("Это же уже было!");
                stats.printResult(cash.get(inputText));
            } else {
                stats.printResult(stats.counterCharacters(inputText));
            }
            cash.put(inputText, stats.counterCharacters(inputText));
            System.out.println("Если желаете закончить, напишите done: ");
            inputText = sc.nextLine();
            isDone = inputText.equals("done");
        }
    }
}
