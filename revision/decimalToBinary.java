
public class decimalToBinary {
    public static void main(String[]args){
        
        System.out.println((01111&10101) | 01000 );
        System.out.println(decTObinary(577));
    }
     public static String decTObinary (int dec){
        String binary = " ";
        while (dec !=0){
            int modu = dec % 2;
            binary = modu +binary;
            dec /= 2;
        }
        return binary;
    }
}
