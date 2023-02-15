
public class RecursiveFactoral {
    public static void main(String[]args){
        System.out.println((SOF(4)));
    }
    public static int SOF(int n){
        if(n <= 0)
            return 0;
        return SOF(n-1) +n;
    }
    
}
