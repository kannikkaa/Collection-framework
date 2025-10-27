import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\mayan\\IdeaProjects\\javaPractice\\src\\FileHandling.txt";
        //code to create a new file
        File myFile = new File(filePath);
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("this file cant be created");
            e.printStackTrace();
        }
        //code to write into a file
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("hello\n");
            fileWriter.write("how are you doing?");
            fileWriter.close();
        } catch (IOException e){
            System.out.println("cant write to this file.");
         e.printStackTrace();
        }
        //code to read a file
        try{
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String para = sc.nextLine();
                System.out.println(para);
            }
            sc.close();
        } catch(FileNotFoundException e) {
            System.out.println("could not find the file");
            e.printStackTrace();
        }

        //code to delete a file
        if(myFile.delete()){
            System.out.println("I have deleted this file: "+myFile.getName());
        }
        else{
            System.out.println("some error occurred while deleting th file");
        }
    }
}
