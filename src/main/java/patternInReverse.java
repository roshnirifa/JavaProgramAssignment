//10. Write a program that will give following output:
//12345
//2345
//345
//45
//5
public class patternInReverse {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
