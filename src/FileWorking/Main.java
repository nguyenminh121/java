package FileWorking;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = loadStudentsFromFile("src/FileWorking/data/test_input.txt");

        saveStudentsToFile(students, "src/FileWorking/data/test_output.txt");
    }

    public static List<Student> loadStudentsFromFile(String path) {
        List<Student> list = new ArrayList<>();
        File file = new File(path);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split("\\|");
                
                if (parts.length >= 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    String id = parts[2];
                    
                    list.add(new Student(name, age, id));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }
        return list;
    }
    public static void saveStudentsToFile(List<Student> students, String outputPath) {
        
        try (PrintWriter writer = new PrintWriter(outputPath)) {
            for (Student s : students) {
                writer.println(s.getName() + "|" + s.getAge() + "|" + s.getStudentID());
            }
            System.out.println("Printing to file completed: " + outputPath);
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
