//Print the prime numbers of 2 to 100
public class primeNumber {
    public static void main(String[] args) {

        System.out.println("Prime numbers 2 to 100 are:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    //  check if a number is prime
    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }

        for (int primeNumber = 2; primeNumber <= Math.sqrt(i); primeNumber++) {
            if (i % primeNumber == 0) {
                return false;
            }
        }

        return true;
    }
}
