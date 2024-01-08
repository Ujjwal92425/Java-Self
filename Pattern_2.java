import java.util.*;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        input.close();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a+1; j++) {
                System.out.print("*");
            }
            System.out.println();   
        }

    }
}
