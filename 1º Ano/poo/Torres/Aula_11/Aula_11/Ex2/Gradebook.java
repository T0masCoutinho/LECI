package Aula_11.Ex2;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gradebook {

    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> load(String path) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split("\\|");
                String name = data[0].trim();
                double grade1 = Double.parseDouble(data[1].trim());
                double grade2 = Double.parseDouble(data[2].trim());
                double grade3 = Double.parseDouble(data[3].trim());

                Student student = new Student(name, new ArrayList<>(List.of(grade1, grade2, grade3)));
                students.add(student);

                line = reader.readLine();
            }
        }

        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public Student getStudent(String name) {
        return students.stream().filter(student -> student.getName().equals(name)).findFirst().orElse(null);
    }

    public double calculateAverageGrade(String name) {
        Student student = getStudent(name);
        if (student == null) {
            return 0;
        }

        List<Double> grades = student.getGrades();
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(
                    "Name: " + student.getName() + " | Average Grade: "
                            + ((Math.round(calculateAverageGrade(student.getName()) * 100.0)) / 100.0));
        }
    }
}
