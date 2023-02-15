//this program checks if two strings are anagram or not
package CoddingQuestions;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Array;
public class Q1 {

    public static void main(String[] args) {
       
        // Getting data from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Str1: ");
        String str1 = input.next();
        System.out.println("Enter Str2: ");
        String str2 = input.next();
        
        System.out.println("Are " +str1 +" and " +str2 +" anagram ? " +isAnagram(str1,str2));

    }
    //algorithm to check is anagram or not
    public static boolean isAnagram (String str1, String str2){
        
        //measureing the length of both strings to determine if they have the same coun pf letters
        if (str1.length() == str2.length()){
            //if true
            //convert them into chars
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            
            //sorting them
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            //for loop to check the letters
            for(int i =0; i< c1.length;i++){
                if(c1[i] != c2[i])
                    return false;
            }
        }
        else
            return false;
        
        return true;
    }
}
