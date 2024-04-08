import java.io.*;
class FileHandling
{
    public static void main(String args[]){
        File f = new File("C:\\Users\\ujjwa\\OneDrive\\Desktop");
        try{
            if(f.createNewFile())
            {
                System.out.println("File successfully created");
            }
            else
            {
                System.out.println("File already exists");
            }}
            catch(IOException i)
            {
                System.out.println("File Handled...");
            }
            }
}