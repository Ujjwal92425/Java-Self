import java.util.*;

public class BinaryOperators {
        public static void main (String args[]) {

         Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = input.nextInt();

        System.out.println("Enter the value of b: ");
        int b= input.nextInt();

        input.close();

        // + 
        int c= a+b;
        System.out.println("The sum of both number is : "+c);
        // - 
        int d= a-b;
        System.out.println("The subtraction of both number is : "+d);
        // *
        int e= a*b;
        System.out.println("The multiply of both number is : "+e);
        // /
        int f= a/b;
        System.out.println("The divide of both number is : "+f);
        // 5
        int g= a%b;
        System.out.println("The modlulo of both number is : "+g);

    }   
}
