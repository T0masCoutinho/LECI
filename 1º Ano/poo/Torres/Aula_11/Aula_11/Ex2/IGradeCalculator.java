package Aula_11.Ex2;

import java.util.List;

public interface IGradeCalculator {

    double calculate(List<Double> grades);

    <ArrayList> void load(String path);

    void addStudent(Student student);

    void removeStudent(String name);

    Student getStudent(String name);

    double calculateAverageGrade(String name);

    void printAllStudents();

}
