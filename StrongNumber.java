import java.util.Scanner;

public class StrongNumber {





    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;


        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }


        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        scanner.close();
    }
}

