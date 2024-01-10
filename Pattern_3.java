import java.util.Scanner;
public class Pattern_3 {   
        public static void main(String[] args) {  
            Scanner scanner = new Scanner(System.in);  
            System.out.print("Enter the number of rows for the rhombus: ");  
            int numRows = scanner.nextInt();  
            scanner.close();  
            if (numRows % 2 == 0) {  
                numRows++; // Ensure the number of rows is odd for symmetry.  
            }  
            printRhombus(numRows);  
        }  
        private static void printRhombus(int numRows) {  
            int spaces = numRows / 2;  
            int stars = 1;  
            for (int i = 1; i <= numRows; i++) {  
                // Print spaces  
                for (int j = 1; j <= spaces; j++) {  
                    System.out.print(" ");  
                }  
                // Print stars  
                for (int j = 1; j <= stars; j++) {  
                    System.out.print("*");  
                }  
                System.out.println();  
                if (i <= numRows / 2) {  
                    spaces--;  
                    stars += 2;  
                } else {  
                    spaces++;  
                    stars -= 2;  
                }  
            }  
        }  
    }  
    
