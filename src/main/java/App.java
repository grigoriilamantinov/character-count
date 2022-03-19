import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Добро пожаловать в счётчик символов!\nВведите свою строку: ");

        Scanner sc = new Scanner(System.in);

        CounterCharText counter = new CounterCharText();
        Cache cache = new Cache();
        ResultFormatter resultFormatter = new ResultFormatter();

        String inputText = sc.nextLine();
        boolean isDone = false;
        while (!isDone) {
            if (cache.contains(inputText)) {
                System.out.println(cache.get(inputText));
            } else {
                var countedCharacters = counter.counterCharacters(inputText);
                String formattedResult = resultFormatter.formatResult(countedCharacters);
                cache.put(inputText, formattedResult);
                System.out.println(formattedResult);
            }

            System.out.println("Если желаете закончить, напишите done: ");
            inputText = sc.nextLine();
            isDone = inputText.equals("done");
        }
    }
}

