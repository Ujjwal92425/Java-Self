import java.lang.Exception;
class Exception_1{
    public static void main(String[] args) {
        try {
            int a = 10, b = 2, c;
            c = a / b;
            System.out.println(c);

            int arr[] = { 10, 20, 30 };
            System.out.println(arr[0]); 

            String str = "UjjwalJack";
            System.out.println(str.toUpperCase());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception");
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        catch (NumberFormatException e) {
            System.out.println("Number Exception");
        } 
        
        catch (Exception e) {
            System.out.println("All Exception");
        }
        
    }
}
