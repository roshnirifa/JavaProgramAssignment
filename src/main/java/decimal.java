////3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
public class decimal {
    public static void main(String[] args) {
        double a = 15.5276;

        System.out.println("a = " + String.format("%.2f", a));
    }
}
