public class TypeConversion {
    public static void main(String[] args) {
        byte b=127;
		int a=b;
        //above byte is automatically converted into int -> it is implicit conversion.
		System.out.println(b);
		System.out.println(a);
		
		byte b1=125;
		int a0=b1;
		System.out.println(b1);
		System.out.println(a0);
		//when we have to assign int value into byte then we have to forcefully converted into byte
        //it is explicit conversion (int > byte)

		int aa=257;
		byte k=(byte)aa;  // here we do 257 % 256(complete range) -> 1.


		 //explicit conversion  float > int  
		float f=5.6f;
		int t=(int)f; //round of to 5.6 to 5
		
		int a2=2567;
		byte b2=(byte)a;
		System.out.println(k);
		
		byte a3=10;
		byte b4=20;
        //here automaticall type promotion happens
		int result=a*b;
		System.out.println(result);
	
	
    }
}
