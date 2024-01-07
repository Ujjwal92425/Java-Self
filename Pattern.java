import java.util.*;

public class Pattern {
    public static void main(String[] args) {
       

    //    Pattern 1 : *
    //                **
    //                ***
    //                ****
        Scanner num = new Scanner(System.in);

        int a= num.nextInt();
        num.close();                                          
        // for (int i = 1; i<= a; i++) {                         
        //     for (int j = 1; j <= i ; j++) {                   
        //         System.out.print("*");                        
        //     }
        //     System.out.println("");    
        // }  
           


        // Pattern 2 : ****
        //             ***
        //             **
        //             *

        
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");     
        } 
    }
    
}
