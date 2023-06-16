//5. Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5
public class findKeyWithoutBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        int index = -1; // Initialize the index variable

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                index = i; // Update the index variable when the element is found
                break; // Exit the loop since we found the element
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
