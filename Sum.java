
import java.util.*;

public class Sum {
    public static void main (String args[] ) {

        Scanner input = new Scanner(System.in);// to take input

        System.out.print("Entet the valuse of a : ");
        int a = input.nextInt(); // taking input value of a

         System.out.print("Entet the valuse of b : ");
        int b = input.nextInt(); // input of value of b

        int c;
        c=a+b; 

        System.out.println("The sum of a and b is : "+c);

        input.close();//closing the input 

    }
    
}
