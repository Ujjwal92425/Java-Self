import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        
        // int a = 5;
        
        // for (int i = 1; i <= a; i++) {
        //     for (int j = 1; j <=1; j++) {
        //         System.out.print("*");
        //     }
               
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
