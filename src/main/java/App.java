import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CounterCharText stats = new CounterCharText();
        Scanner sc = new Scanner(System.in);
        System.out.print("Добро пожаловать в счётчик символов!\nВведите свою строку: ");
        String inputText = sc.nextLine();

        boolean isDone = false;
        Map<String, Map<Character, Integer>> cash = new HashMap<>();

        while (!isDone) {
            if (cash.containsKey(inputText)) {
                System.out.println("Это же уже было!");
                var map = cash.get(inputText);
                for (Map.Entry<Character, Integer> result : map.entrySet()) {
                    System.out.println("Символ: " + result.getKey() + " - встречается: " + result.getValue());
                }
            } else {
                var map = stats.counterCharacters(inputText);
                System.out.println("Ваш результат:");
                for (Map.Entry<Character, Integer> result : map.entrySet()) {
                    System.out.println("Символ: " + result.getKey() + " - встречается: " + result.getValue());
                }
            }
                cash.put(inputText, stats.counterCharacters(inputText));
                System.out.println("Если желаете закончить, напишите done: ");
                inputText = sc.nextLine();
                isDone = inputText.equals("done");
        }
    }
}
