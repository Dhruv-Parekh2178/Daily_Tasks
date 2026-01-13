public class Literals {
    public static void main(String[] args) {
        // binary literal 101 -> 5
        int num1=0b101;
            System.out.println(num1);
            // decimal literals
        int num2=0x7E;
         System.out.println(num2);
         // for not confusing in number of zero just like 1,00,000
        int num3=10_00_00_000;
          System.out.println(num3);
        //interger gets coverted into double
        float num4=56;
        System.out.println(num4);
        // integer gets converted into double
        double num5=56;
        System.out.println(num5);
        // 12 e^10
        double num6=12e10;
        System.out.println(num6);
          //int can't be converted into boolean
        // boolean num7= 1;
        // System.out.println(num7);
//  char can be incremented here unicode is increment
        char c='a';
        System.out.println(c);
        c++;

        char c1='a';
        c1++;
        System.out.println(c1);
    }

}