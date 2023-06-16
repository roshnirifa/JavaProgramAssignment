//11. Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]
import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int numbers[] = {5, 3, 9, 7, 4, 1, 8};
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println("given array "+ Arrays.toString(numbers));
        System.out.println("second largest element: "+ secondLargest);
    }
}
