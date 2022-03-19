package facade;

import cache.Cache;
import counter.Counter;
import formatter.Formatter;

import java.util.Scanner;

public class CharCounterFacade {

    private Cache cache;
    private Counter counter;
    private Formatter formatter;

    public CharCounterFacade(
        Cache cache,
        Counter counter,
        Formatter formatter
    ) {
        this.cache = cache;
        this.counter = counter;
        this.formatter = formatter;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Добро пожаловать в счётчик символов!\nВведите свою строку: ");
        String inputText = sc.nextLine();
        boolean isDone = false;
        while (!isDone) {
            if (cache.contains(inputText)) {
                System.out.println(cache.get(inputText));
            } else {
                var countedCharacters = counter.counterCharacters(inputText);
                String formattedResult = formatter.formatResult(countedCharacters);
                cache.put(inputText, formattedResult);
                System.out.println(formattedResult);
            }

            System.out.println("Если желаете закончить, напишите done: ");
            inputText = sc.nextLine();
            isDone = inputText.equals("done");
        }
    }
}
