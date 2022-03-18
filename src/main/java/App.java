import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        CounterCharText stats = new CounterCharText();
        Scanner sc = new Scanner(System.in);
        System.out.print("Добро пожаловать в счётчик символов!\nВведите свою строку: ");
        String inputText = sc.nextLine();

        boolean isDone = false;
        Map<String, Map <Character, Integer>> cash = new HashMap<>();

        while (!isDone) {
            if (cash.containsKey(inputText)) {
                System.out.println("))))" + cash.get(inputText));
            } else {
                System.out.println("Ваш результат:\n" + stats.counterCharacters(inputText));
            }
            cash.put(inputText, stats.counterCharacters(inputText));
            System.out.println("Если желаете закончить, напишите done: ");
            inputText = sc.nextLine();
            isDone = inputText.equals("done");

        }
    }
}
