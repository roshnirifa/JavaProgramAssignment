//13. Take any number as input and print the reverse of the number
//input: 12345
//output: 54321

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
