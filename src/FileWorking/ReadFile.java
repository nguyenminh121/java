package FileWorking;

import java.util.*;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/FileWorking/data/test_input.txt");
        Scanner sc = null; 
        
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } finally {

            if (sc != null) {
                sc.close();
                System.out.println("Finished reading file.");
            }
        }
    }
}