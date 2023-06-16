//Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//Input: Civic
//Output: true
//Input: One
//Output: false

public class palindrome {
    public static void main(String[] args) {
        String input1 = "Civic";
        boolean isPalindrome1 = isPalindrome(input1);
        System.out.println("input: "+input1 + '\n' + "output: " + isPalindrome1);

        String input2 = "One";
        boolean isPalindrome2 = isPalindrome(input2);
        System.out.println("input: "+input2 +'\n' + "output: " + isPalindrome2);
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
