import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerOtherReadableModesLikeFile {
        public static void main(String[] args) {
            try {
                File file = new File("src/data.text"); // or just "data.txt" if file is in root
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }

                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
    }

