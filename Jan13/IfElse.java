public class IfElse {
    public static void main(String[] args) {
//only if statement
		
//		int Age=23;
//		if(x>18) {
//			System.out.println("can vote");
//		}
		//we aslo give true/false in the condition 
        //if we give fasle the it can't be run
//		if(true) {
//			System.out.println("Hello");
//		}
		
		int X=28;
		if(X>99 && X<=200) {       //100-200
			System.out.println("within range");
		}
		System.out.println("Not in range");
			
   // use of else If 
		
		int x=8;
		int y=7;
		int z=9;
		if(x>y && x>z)         //false
			System.out.println(x);
		else if(y>z)
			System.out.println(y);
		else
			System.out.println(z);

		// ternry operator 
        	int n=5;
		int result=0;
		result = n%2==0 ? 10 : 20;
		System.out.println(result);
}
}