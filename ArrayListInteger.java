package Lab6Q2;
import java.util.ArrayList;
public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        int sum = 0;
        for (int num : numbers) if (num % 2 == 0) sum += num;

        System.out.println("Sum of even numbers: " + sum);
    }
}
