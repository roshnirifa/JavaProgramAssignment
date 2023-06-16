//6. Generate random 10 integer numbers in an array and
// print out all the numbers from array and also print the max and min number from the array

import java.util.Arrays;

public class randomNumber {
    public static void main(String[] args) {
        int maxRandVal = 50;
        int minRandVal = 10;


        int[] arr = new int[10];
        int max = arr[0];
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (maxRandVal - minRandVal ) + minRandVal);
//            System.out.println(arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("random number");
        System.out.println(Arrays.toString(arr));
        System.out.println("max num: " + max);
        System.out.println("min num: " + min);


    }
}
