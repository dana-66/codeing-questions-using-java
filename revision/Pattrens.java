
package revision;

import java.util.Scanner;

public class Pattrens {
    public static void main (String[]args){

        //1. Pyramid Program

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * *
int n =5;
           for (int i=0; i<n; i++){ //outer loop for number of rows(n) 
            { for (int j=n-i; j>1; j--){ //inner loop for spaces
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
    } 

//2. Right Triangle Star Pattern
//
// *
// * *
// * * *
// * * * *
// * * * * *

int c = 5;
       for (int i=0; i<c; i++) //outer loop for number of rows(n) 
            { 
                System.out.print(" "); //print space
             
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
       
       
       
       
       
       
// 3. Left Triangle Star Pattern
//
//           * 
//         * * 
//       * * * 
//     * * * * 
//   * * * * * 
    
int b= 5;
int i,j; 
        for(i=0; i<b; i++) //outer loop for number of rows(n)   
           {
            for(j=2*(b-i); j>=0; j--){ // inner loop for spaces
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        }
//    4. Diamond Shape Pattern Program in Java
//
//Enter the number of rows: 5
//
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int rows = input.nextInt();
    
    int  space = 1;

    space = n - 1;
    for (j = 1; j<= n; j++)
    {
        for (i = 1; i<= space; i++)
        {
        System.out.print(" ");
        }
        space--;
        for (i = 1; i <= 2 * j - 1; i++)
        {
        System.out.print("*");
        }
        System.out.println("");
        }
        space = 1;
        for (j = 1; j<= n - 1; j++)
        {
        for (i = 1; i<= space; i++)
        {
        System.out.print(" ");
        }
        space++;
        for (i = 1; i<= 2 * (n - j) - 1; i++)
        {
        System.out.print("*");
        }
        System.out.println("");
        }
        
//        5. Downward Triangle Star Pattern
//
//Enter the number of rows: 5
//
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

     Scanner in = new Scanner(System.in);
     System.out.print("Enter the number of Rows : ");
     int row = in.nextInt();
     for( int f  = rows-1; f >=0 ;f--){  //we decreesed cuz its downward
         for(int e=0; e<=f;e++){
             System.out.print("*" +" ");
         }
         System.out.println();
     }
     in.close();
    }} 
 
    
    
  
    
       
    

