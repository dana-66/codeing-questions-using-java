/*
    Write a Pseudocode algorithm which prompts the user to enter the price of an 
    item and which calculates and prints the new price after a discount of 12%. 
 */
package CoddingQuestions;
import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = input.nextDouble();
        
        System.out.println("price after 12% discount: " +discount(price,12));
    }
    
    public static double discount (double price, double discount){
        double d = discount / 100;
        double results = price - (price * d);
        return results;
    }
    
}
