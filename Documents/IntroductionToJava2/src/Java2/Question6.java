//  6. WAP showing try, multi-catch and finally blocks.

package Java2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question6 {

    public void openFile(String fileName) throws IOException {
        FileReader reader = null;
        try {
            // constructor may throw FileNotFoundException
            reader = new FileReader(fileName);
            int i = 0;
            System.out.println("File Reading.......\n");
            while (i != -1) {
                //reader.read() may throw IOException
                i = reader.read();
                System.out.print((char) i);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found..");
        } catch (IOException e) {
            System.out.println("IOException occurs..");
        } finally {
            if (reader != null) {
                System.out.println("\nReading Completed, Closing File in Finally block");
                reader.close();
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name with complete path: ");
        String fileName = sc.next();
        Question6 obj = new Question6();
        obj.openFile(fileName);
    }
}
