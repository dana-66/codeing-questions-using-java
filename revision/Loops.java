
package revision;
public class Loops {
    public static void main(String[]args){
//        //a
//        for (int i =1 ; i<=10;i++){
//            if(i%2==0)
//            System.out.println("*");
//        }
//
//       //b
//        for (int i =2 ; i<=10;i+=2){
//            System.out.println(i);
//        }
//        
        //code b is better because its faster than a 
    
     //Q find the numbers that accept the devision on 9 from 100 till 200
     
//     
//     for (int i = 100 ; i <= 200;i++){
//         if(i%9 == 0)
//             System.out.println(i);
//     }
    //لايجاد حاصل جمع الاعداد التي تقبل القسمة على الرقم
    //9 من 100 الى 200 
    int sum = 0;
    for (int i = 100 ; i <= 200;i++){
         if(i%9 == 0){
             sum = i+ sum;
         }
             System.out.println(sum);
     }
    
    
    
    
    
    
    }
    
}