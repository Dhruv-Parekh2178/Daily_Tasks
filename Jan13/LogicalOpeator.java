public class LogicalOpeator {
    	public static void main(String[] args) {
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		// && => AND 
        // || => OR
        // ! => NOT
//		boolean result= x>y && a<b ;  => true
//		boolean result= x>y || a<b ;  =>  true 
//		boolean result= x>y && a>b ;  => flase
//		boolean result= x>y || a>b ;   => true 
//		boolean result= x<y && a<b ;   => fasle
//		boolean result= x<y || a<b ;  =>  true
//		boolean result= x<y || a<b || a>1 ;  => true
		
//		System.out.println(result);
		
		boolean result= a>b ;
        //here ! to invert the boolean answer
		System.out.println(!result);
		
	}

}
