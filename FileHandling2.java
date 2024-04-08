import java.io.*;

public class FileHandling2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\ujjwa\\OneDrive\\Desktop\\Java\\Java-Self\\java.txt");
        try {
            if(f.createNewFile()) {
                System.out.println("File Created Successfully");
            }
            else{
                System.out.println("File Already Exist");
            }
        } catch (IOException e) {
            e.printStackTrace(); // This will print the stack trace of the IOException
        }
    }
}
