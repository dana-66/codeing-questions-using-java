
//  int x;
//  
//  public Test(String t) {
//     System.out.println("Test");
//  }
//
//  public static void main(String[] args) {
//    Test test = null;
//    System.out.println(test.x);
//  }
//}
    public class ReplaceAllMethod {
        public static void main (String[]args){
	
		String str = "Tutorials on Java Programming";
		String str1 = "We are abc working at abc company";
		
		String str2 = str.replaceAll("a", "x");
		String str3 = str1.replaceAll("a", "x");
		String str4 = str.replaceAll("o", "xy");
		String str5 = str1.replaceAll("abc", "xyz");
		String str6 = str1.replaceAll("abx", "xyz");

		System.out.println("After Replacing String str = " + str2);
		System.out.println("After Replacing String str1 = " + str3);
		System.out.println("After Replacing String str = " + str4);
		System.out.println("After Replacing String str1 = " + str5);
		System.out.println("After Replacing String str1 = " + str6);
	}
}