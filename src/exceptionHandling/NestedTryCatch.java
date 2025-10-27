package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer block: File operations
            FileReader file = new FileReader("src/data.text");
            BufferedReader br = new BufferedReader(file);

            try {
                // Inner block: Data processing
                String line = br.readLine();//read full line from file and put it in line variable
                int number = Integer.parseInt(line);  // May throw NumberFormatException

                int result = 100 / number;            // May throw ArithmeticException
                System.out.println("Result is: " + result);

            } catch (NumberFormatException e) {
                System.out.println("The file doesn't contain a valid number.");
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            } finally {
                br.close(); // Always close the file resource(can throw IO exception)
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        } catch (IOException e) {
            System.out.println("Error closing the file.");
        }

    }
}

