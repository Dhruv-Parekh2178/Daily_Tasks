public class SwitchState {
    public static void main(String[] args) {
        	int n=8;
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
		System.out.println("Wednesday");
			break;
		case 4:
		System.out.println("Thursday");
			break;
		case 5:
		System.out.println("Friday");
			break;
		case 6:
		System.out.println("Saturday");
			break;
		case 7:
		System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid number");			
		}


        //for enhanced switch case 

        /*
        in enhanced switch we don't have to break after each statement 
        switch(choice){
          case 1 : {
          }
          case 2 : {}
          ...
          ...
        }
        */
    }
}
