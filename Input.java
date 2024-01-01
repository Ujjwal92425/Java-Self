
import java.util.*;

public class Input {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();
        System.out.println(num);

        sc.nextLine();


        String name = sc.nextLine();
        System.out.println(name);

        
        float number =sc.nextFloat();
        System.out.println(number);

       
        char  ch = sc.next().charAt(0); 
        System.out.println(ch);

        sc.close();
    }
    
}

// *******************************************************FULL PROGRAM : ************************************************************************


// import java.util.Scanner;

// public class Input {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter an integer: ");
//         int num = sc.nextInt();
//         System.out.println("You entered: " + num);

//         System.out.print("Enter a string: ");
//         // Consume the leftover newline character from the previous input
//         sc.nextLine();
//         String name = sc.nextLine();
//         System.out.println("You entered: " + name);

//         System.out.print("Enter a float: ");
//         float number = sc.nextFloat();
//         System.out.println("You entered: " + number);

//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);
//         System.out.println("You entered: " + ch);

//         // Close the scanner to free up resources
//         sc.close();
//     }
// }




