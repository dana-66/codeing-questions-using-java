/*
Write an algorithm to read ELEVEN numbers find their average and print it. The 
algorithm should also print the number of times 6 occurs in the data. For example, 
given the input data: 8, 4, 6, 9, 6, 5, 6, 10, 7, 0, 16
 */
package CoddingQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {
        q5Algo(); 
    }
    
    public static void q5Algo () {
        //read the input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers (11): ");
        int []numbers = new int [11];
        double avg = 0;
        int sum = 0;
        int count6 = 0;
        //for loop to store the numbers
        for(int i = 0; i< numbers.length;i++){
            numbers[i] = input.nextInt();
            sum += numbers[i];
            if(numbers[i] == 6){
                count6++;
            }
        }
        avg = (sum / numbers.length);
        
        //printing the results
        System.out.println(Arrays.toString(numbers));
        System.out.println("the avg for the above array: " +avg 
                +"\nand the number 6 showed up " +count6 +" times");
    }
    
}
