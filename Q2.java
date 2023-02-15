
package CoddingQuestions;
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        //getting info from user
        String name[] = new String [3];
        int age[] = new int [3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <name.length;i++){
            System.out.println("Enter the name,");
            name[i]= input.next();
            System.out.println("Enter the age");
            age[i] = input.nextInt();
        }
        
        //to find the index of the oldest age 
        int indexOfOldest = oldest(age);
        String nameof = name[indexOfOldest];
//        System.out.println("\nindex of oldest " + indexOfOldest);
        System.out.println("the name of the oldest is : " +nameof +" and age of : " +age[indexOfOldest]);
//        System.out.println("the oldest age is " +age[indexOfOldest] +" has the name: " +name[indexOfOldest]);
    }
//    //method to get data from user
//    public static void info(){
//        String name[] = null ;
//        int age[] = null ;
//        Scanner input = new Scanner(System.in);
//        for(int i = 0; i < 9;i++){
//            System.out.println("Enter the name,age");
//            name[i]= input.next();
//            age[i] = input.nextInt();
//        }
//        
////        //finding the oldest
////        int max = age[0];
////        for(int i = 0; i < age.length;i++){
////            
////            if(max < age[i])
////                max = age[i];
////        }
//        
//        }
    //finding the oldests index
    public static int oldest(int array[]){
        int i;
        int max = array[0];
        for(i = 0; i < array.length;i++){
            if(max >= array[i])
                max = array[i];
        }
        return i - 1;
    }  
}
