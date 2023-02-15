// reversing words in a string
package CoddingQuestions;
import java.util.Scanner;
import java.util.Stack;
public class Q3 {
//
//    public static void main(String[] args) {
////       Scanner input = new Scanner(System.in);
////       System.out.println("Enter a txt: ");
////       String txt = input.nextLine();

//       System.out.println(wordRev(txt.toCharArray()));
//    }
//    //to reverse
//    public static void reverse(char []str, int start, int end){
//        //temp variable 
//        char temp;
//        while(start <= end){
////            swapping the first and last letters
//            temp = str[start];
//            str[start] = str[end];
//            str[end] = str[start];
//            start++;
//            end--;
//        }
//        }
//    
////    /to reverse words
//    public static char[] wordRev(char[] str){
//        int start = 0;
//        for(int end = 0; end < str.length;end++){
//            // If we see a space, we reverse the previous  word (word between the indexes start and
//            //end-1 i.e., s[start..end-1]
//            if(str[end] == ' '){
//                reverse(str,start,end);
//                start = end + 1;
//            }
//        }
//        //reverse the last word
//        reverse(str, start, str.length-1);
//        
//        //reverseing the whole string
//        reverse(str, 0, str.length-1);
//        return str; 
//    }
    
    
// Reverse the letters
// of the word
static void reverse(char str[],int start,int end)
{
  // Temporary variable
  // to store character
  char temp;
   
  while (start <= end)
  {
    // Swapping the first
    // and last character
    temp = str[start];
    str[start] = str[end];
    str[end] = temp;
    start++;
    end--;
  }
}
// Function to reverse words
static char[] reverseWords(char []s)
{
  // Reversing individual words as
  // explained in the first step
 
  int start = 0;
  for (int end = 0; end < s.length; end++)
  {
    // If we see a space, we
    // reverse the previous
    // word (word between
    // the indexes start and end-1
    // i.e., s[start..end-1]
    if (s[end] == ' ')
    {
      reverse(s, start, end);
      start = end + 1;
    }
  }
 
  // Reverse the last word
  reverse(s, start, s.length - 1);
 
  // Reverse the entire String
  reverse(s, 0, s.length - 1);
  return s;
}
 
// Driver Code
public static void main(String[] args)
{
//  String s = "i like this program very much ";
//  char []p = reverseWords(s.toCharArray());
//  System.out.print(p);
    
    Scanner input = new Scanner(System.in);
       System.out.println("Enter a txt: ");
       String txt = input.nextLine();

       System.out.println(reverseWords(txt.toCharArray()));
       System.out.println(revWords(txt));
}
public static String revWords(String s)
   {
       // code here 
       Stack<String> stack= new Stack<>();
       String t="";
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' '){
               stack.push(t);
               t="";
           }
           else{
               t=t+s.charAt(i);
           }
       }
       while(!stack.empty()){
           t = t+ ' ' + stack.pop();
       }
       return t;
   }
}
    

