import java.io.IOException;
import java.util.Scanner;
public class H5_PART2 {
    public static void main (String[]args) throws IOException{
        int count =0;
        int correctCount = 0;
        int wrongCount =0;
        int n =0;
        int Choice=0;
        long StartTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);
        
        
        do   {
              System.out.print(" \t\t\t\t Welcome To  My Math WorkBench ");
             System.out.println("\n 1_ Addition Quiz."
               + "\n 2_ Subtraction Quiz."
               + "\n 3_ Multiplication Quiz."
               + "\n 4_ Division Quiz."
               + "\n 5_ Exit Program.");
       
             System.out.println("\nEnter your choice :  ");
              Choice = input.nextInt();
             System.out.println("How Many Question Do You Need : ");
               n = input.nextInt();
             System.out.println("Press Enter to Start ");
              char tmp = (char) System.in.read();
        
        
         
        if ( Choice == 1){            //addition
             
            while (count <n){
             int number1 = (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
             System.out.println(number1 +" + " +number2 +" = ");
            int answer = input.nextInt();
             if(number1 + number2 == answer){
               System.out.println( answer +" is correct :) ");
               correctCount++;
             }else{
              System.out.println (answer +" is wrong!! " +number1 +" + " +number2 +" it should be :" +(number1 + number2));
              wrongCount++;
             }
              count++;}
              long endTime = System.currentTimeMillis();
              long testTime =   endTime - StartTime ;
              System.out.println(" corrct Count is " +correctCount +"\n wrong Count is " +wrongCount);
              System.out.println (" test time is " +testTime /1000 +" Seconds");
        
        }
        else if (Choice == 2){        //subtractions
             
            while(count < n){
             int number1= (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
                if (number1 < number2 ){
                   int temp = number1;
                   number1 = number2;
                   number2 = temp;
                  }
               System.out.print( +number1 +" - " +number2 +" = ");
               int answer = input.nextInt();
                if (number1 - number2 == answer){
                   System.out.println(answer +" is correct ");
                   correctCount++;
               }else{
                   System.out.println(answer +" is wrong!!" +number1 +" - " +number2 +" it should be :" +(number1 - number2));
                   wrongCount++;
               }
               count++;
           }long endTime = System.currentTimeMillis();
            long testTime =   endTime - StartTime ;
        
            System.out.println(" corrct Count is " +correctCount +"\n wrong Count is " +wrongCount);
            System.out.println (" test time is " +testTime/1000 +" Seconds");}
         
        else if (Choice == 3){      //multiplication
            
            while (count <n){
             int number1 = (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
             System.out.println(number1 +" * " +number2 +" = ");
            int answer = input.nextInt();
            if(number1 * number2 == answer){
               System.out.println( answer +" is correct :) ");
               correctCount++;
            }else{
              System.out.println (answer +" is wrong!! " +number1 +" * " +number2 +" it should be :" +(number1 * number2));
            wrongCount++;}
            count++;}
            long endTime = System.currentTimeMillis();
            long testTime =   endTime - StartTime ;
        
            System.out.println(" correct Count is " +correctCount +"\n wrong Count is " +wrongCount);
            System.out.println (" test time is " +testTime/1000 +" Seconds");
            
   
          }
        else if (Choice == 4){       //division
           
            while (count <n){
             int number1 = (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
             if (number1 < number2 ){
                   int temp = number1;
                   number1 = number2;
                   number2 = temp;
                  }
               
             System.out.println(number1 +" / " +number2 +" = ");
            double answer = input.nextInt();
            if(number1 / number2 == answer){
               System.out.println( answer +" is correct :) ");
               correctCount++;
            }else{
              System.out.println (answer +" is wrong!! \n" + number1 +" / " +number2 + " should be " + (number1/number2));
            wrongCount++;
            }
            count++;
           }
              long endTime = System.currentTimeMillis();
            long testTime =   endTime - StartTime ;
        
            System.out.println(" correct Count is " +correctCount +"\n wrong Count is " +wrongCount);
            System.out.println (" test time is " +testTime/1000 +" Seconds");
            
         }
       else if (Choice == 5){
            
            break;
           
        }
        
        
        } while (Choice != 5); 
        
        
        System.out.println("Thank you for useing My Math WorkBench :) ");
        
    }
}
// professor when u press 5 to exit it still ask you the two questions then it exits :)