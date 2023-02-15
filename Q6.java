/*
Write a Pseudocode algorithm to print a conversion table from miles to 
kilometers. The table ranges from 5 to 100 miles in steps (1 mile = 1.61 
kilometers). 
 */
package CoddingQuestions;

public class Q6 {

    public static void main(String[] args) {
        milesToKm ();
    }
    
    public static void milesToKm () {
//        double km = 1.61 * miles;
        System.out.println("miles \t km");

        for(int i = 0; i<100; i++){
            System.out.println((i)+" \t " +(1.61 * i));
        }
    }
}
