
//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class swap_without_temp_variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;  //30
        b = a - b;  //30-20 = 10
        a = a - b;  // 30-10 =20


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
