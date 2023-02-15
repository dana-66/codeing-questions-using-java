import java.util.Scanner;
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
     { 
       Scanner input= new Scanner (System.in);
       int n;
       System.out.println("choose natural number: ");
       n=input.nextInt();
       System.out.println("facturial:: "+factorial(n));
     }
   private static int factorial(int number)
     {
       if (number <= 1)
         return 1;
      else
         return number * factorial(number - 1);
     }
    
}
