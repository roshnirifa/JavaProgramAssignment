//Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]
//key = 5

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        Arrays.sort(numbers); // Sort the array in ascending order

        boolean flag = false;
        int lower = 0;
        int higher = numbers.length - 1;

        while (lower <= higher) {
            int mid = (lower + higher) / 2;

            if (numbers[mid] == key) {
                System.out.println("Key is found ");
                flag = true;
                break;
            } else if (numbers[mid] < key) {
                lower = mid + 1;
            } else if (numbers[mid] > key) {
                higher = mid - 1;
            }
        }

        if (!flag) {
            System.out.println("Element not found");
        }


    }
}
