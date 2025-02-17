package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);  

    public void addStudents(int n) {
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.enterInfo();
            list.add(student);
        }
    }

    public Student findById(String id) {
        for (Student student : list) {
            if (student.ID.equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteById(String id) {
        Student student = findById(id);
        if (student != null) {
            list.remove(student);
            return true;
        }
        return false;
    }

    public boolean editById(String id) {
        Student student = findById(id);
        if (student != null) {
            student.enterInfo();
            return true;
        }
        return false;
    }

    public void displayAll() {
        for (Student student : list) {
            student.displayInfo();
        }
    }

        public void closeScanner() {
        scanner.close();
    }
}
