import java.util.*;

public class Loops {
    public static void main(String[] args) {
       /*  Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i=0;
        for (i = 0; i <=number; i++) {
            System.out.println("******");
        }
        
        sc.close();
        */


        // Table printing : Using loop 

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N*i);
            
        }
        sc.close();
    } 
}

