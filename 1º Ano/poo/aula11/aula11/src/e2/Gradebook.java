package e2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class Gradebook {

    HashSet<Student> alunos = new HashSet<>();

    void load(String fileName)throws FileNotFoundException{
        
        Scanner sc = new Scanner(new FileReader(fileName));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] lineSplitted = line.split("||");

            String name = lineSplitted[0];
            List<Double> notas = new ArrayList<>();
            notas.add(Double.parseDouble(lineSplitted[1]));
            notas.add(Double.parseDouble(lineSplitted[2]));
            notas.add(Double.parseDouble(lineSplitted[3]));
            Student s = new Student(name, notas);

            alunos.add(s);
        }
    }

    void addStudent(Student s){
        alunos.add(s);
        
    }

    void removeStudent(String studentName){
        for(Student s : alunos){
            if(s.getName().equals(studentName)){
                alunos.remove(s);
            }
        }


    }

    Student getStudent(String studentName){
        for(Student s : alunos){
            if(s.getName().equals(studentName)){
                return s;
            }
        }
        return null;

    }

    double calculateAverageGrade(String studentName){
        for(Student s : alunos){
            if(s.getName().equals(studentName)){
                double sum += s.getGrades();
            }
            
        }

    }

    void printAllStudents(){

    }

}
