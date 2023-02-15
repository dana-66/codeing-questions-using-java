
public class Method_Calling {

    public static void main(String[] args) {
        int s = 10;
        int x[] = {10, 20};
        
        System.out.println("s before change: " +s);
        System.out.println("x[0] before change: " +x[0]);
        
        change(s);
        change(x);
        
        System.out.println("\nAFTER CHANGE");
        System.out.println("s = " +s);
        System.out.println("x[0] = " +x[0]);
    }
    
    public static void change( int n){
        n = 200;
        System.out.println("\nin changing n = " +n);
    }
    
    public static void change( int array[]){
        array[0] = 200;
        System.out.println("in changing array[0]= " +array[0]);
    }
}
