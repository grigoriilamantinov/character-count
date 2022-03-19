import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CounterCharText counter = new CounterCharText();
        Scanner sc = new Scanner(System.in);
        System.out.print("Добро пожаловать в счётчик символов!\nВведите свою строку: ");
        String inputText = sc.nextLine();

        boolean isDone = false;
        while (!isDone) {
            ResultFormatting sout = new ResultFormatting();

            if (counter.cashCheck(inputText)) {
            System.out.println("Это же уже было!");
            sout.printResult(counter.cashGet(inputText));
            } else {
            sout.printResult(counter.counterCharacters(inputText));
            }

            System.out.println("Если желаете закончить, напишите done: ");
            inputText = sc.nextLine();
            isDone = inputText.equals("done");
        }
    }
}

