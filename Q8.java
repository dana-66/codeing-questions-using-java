/*
Write a Pseudocode algorithm to read three numbers and print the highest and 
lowest number. 
 */
package CoddingQuestions;
import static java.lang.Math.min;
import java.util.Scanner;
public class Q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        HighestAndLowest(num1, num2, num3);
    }
    
    public static void HighestAndLowest (int num1, int num2, int num3){
            
        if ((num1 > num2) && (num1 > num3))
        {
            System.out.println(num1+" is the heighest and  " +min(num2,num3) +" is the lowest");
        }
        else if((num2 > num3) && (num2 > num1)){
            System.out.println(num2+" is the heighest and  " +min(num1,num3) +" is the lowest");
    }
        else if((num3 > num1) && (num3 > num2)){
            System.out.println(num3+" is the heighest and  " +min(num1,num2) +" is the lowest");
        }
    }
}
