package Lab6Q2;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("CAR");
        stringList.add("BUS");
        stringList.add("TRUK");
        stringList.add("MONSTER TRUCK");

        System.out.println("Original List: " + stringList);


        List<String> reversedList = new ArrayList<>();
        for (int i = stringList.size() - 1; i >= 0; i--) {
            reversedList.add(stringList.get(i));
        }

        System.out.println("Reversed List: " + reversedList);
    }
}
