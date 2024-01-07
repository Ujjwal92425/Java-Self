//factorial of a number : 

import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. whose factroial u want : ");
        int num = input.nextInt();
        input.close();
        

        if (num == 0 || num==1) {
            System.out.println("Fatorial of "+num+ " is : 1");  
        }
        else {
            int factorial=1;
            for (int i = 1; i <= num; i++) {
                factorial=factorial*i; 
            }
            System.out.println("Factorial of "+num+ " is  : "+factorial);
        }
    }
    
}
