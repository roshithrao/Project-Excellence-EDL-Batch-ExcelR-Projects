package pracapp;

import java.util.*;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            studentList.forEach(System.out::println);
        }
    }

    public void updateStudent(int id, String newName, int newAge) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setAge(newAge);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void searchStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}