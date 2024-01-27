import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    /*
    Напишите программу, которая использует Stream API для обработки списка чисел.
    Программа должна вывести на экран среднее значение всех четных чисел в списке.
     */
    public static void main(String[] args) {
        int num = 15;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num; i++){
            list.add(new Random().nextInt(1, 101));
        }

        list.forEach(x -> System.out.print(x + " "));
        System.out.println("\n***");
        System.out.printf("Среднее значение чётных чисел списка = %.2f",
                (double) list.stream()
                        .filter(x -> x % 2 == 0)
                        .reduce(0, Integer::sum)
                /
                list.stream()
                        .filter(x -> x % 2 == 0)
                        .count());
    }
}
