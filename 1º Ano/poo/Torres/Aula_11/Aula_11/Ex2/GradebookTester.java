package Aula_11.Ex2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GradebookTester {
    public static void main(String[] args) throws IOException {
        // Create a new Gradebook instance
        Gradebook gradebook = new Gradebook();

        // Load the student data from a text file

        gradebook.load("./src/Aula_11/Ex2/alunos.txt");

        // Add a new student to the collection
        Student newStudent = new Student("Johny May", new ArrayList<>(List.of(10.0, 15.0, 19.0)));
        gradebook.addStudent(newStudent);

        // Remove a student from the collection
        gradebook.removeStudent("Jane Smith");

        // Retrieve a student from the collection
        gradebook.getStudent("John Doe");

        // Calculate the average grade for a specific student
        double averageGrade = gradebook.calculateAverageGrade("John Doe");
        System.out.println("Average grade for John Doe: " + ((Math.round(averageGrade * 100.0)) / 100.0));

        // Print a summary of all students in the collection
        gradebook.printAllStudents();

    }

}
