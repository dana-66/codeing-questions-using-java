import java.util.Arrays;
import java.util.Scanner;
public class Arrayy {

    public static void main(String[] args) {
        //initalizing variables
        int lower = 0; int upper =0; int diagonal = 0;
        //declaring the array
        int x[][] = new int[4][4];
        Scanner input = new Scanner(System.in);
        
        //getting infos from the user
        for(int r = 0; r < x.length ;r++){
           //insserting the columns
           for(int c = 0; c < x[r].length;c++){
            System.out.println("Enter x[" +r +"][" +c +"] value: ");
            x[r][c] = input.nextInt();
           }
           System.out.println();
        }
        
        //to calculate the results
        //first accessing the rows
        for(int r = 0; r < x.length; r++){
            //accessing the columns
            for(int c = 0; c < x[r].length; c++){
                if(r < c){
                    upper += x[r][c];
                }
                else if (r > c){
                    lower += x[r][c];
                }
                else{ // in this case  r == c
                    diagonal += x[r][c];
                }
            }
        }
        //a way to print the array but not  the best one 
//        System.out.println(Arrays.deepToString(x));

        //better way to print the array 
        for(int r = 0; r < x.length; r++){
            for(int c = 0; c < x[r].length;c++){
                System.out.print(x[r][c] +" ");
            }
            System.out.println();
        }
        
        //printing the results
        System.out.println("\nthe summation of lower is: " +lower);
        System.out.println("the sum of diagonal is : " +diagonal);
        System.out.println("the sum of upper is : " +upper);

    }
    
}
