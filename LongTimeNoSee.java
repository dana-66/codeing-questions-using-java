
import java.util.Scanner;
import java.lang.*;

public class LongTimeNoSee {

    public static void main(String[] args) {
        String x = "456";
        int strValue = Integer.parseInt(x);
        System.out.println(strValue);
        System.out.println("the OR bitwise operation 8|2 = " + (8 | 2));
        System.out.println("the AND bitwise operation 7&3 = " + (7 & 3));
        System.out.println("the XOR bitwise operation 7^3 = " + (7 ^ 3));
//       System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your name: ");
        String name = input.next();
        System.out.println("Whats your age: ");
        int age = input.nextInt();

        System.out.println("well, Hello " + name + "\nIm " + age + " years old too");

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int res = fact(num);
        System.out.println(num + "! = " + res);
    }

    //a recursive method :)
    public static int fact(int n) {
        int results = 0;
        if (n >= 1) {
            results = n * fact((n - 1));
        } else if (n == 0) {
            results = 1;
        }
        return results;
    }

}
