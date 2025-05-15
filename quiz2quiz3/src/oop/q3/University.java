package oop.q3;

import java.util.ArrayList;
import java.util.List;

/**
 * The University class represents a university that holds a collection of students.
 * This class provides methods to add, remove, and print students, as well as a special method
 * to get information about a student based on predefined logic.
 */
public class University {

    // List to store students in the university
    private List<Student> students = new ArrayList<>();
    // Assume the "myself" student corresponds to a specific student
    Student myself = new Student("Aleksandre", "Kvatashidze", "Georgia", "62001046363");
    /**
     * Adds a student to the university.
     *
     * @param s The student to be added.
     */
    public void addStudent(Student s) {
        students.add(s);
    }

    /**
     * Removes a student from the university.
     *
     * @param s The student to be removed.
     * @return true if the student was removed, false otherwise.
     */
    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    /**
     * Prints all students currently in the university.
     */
    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the university.");
        } else {
            System.out.println("List of students in the university:");
            for (Student student : students) {
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }
    }

    /**
     * This method returns different information based on the logic described:
     * 1. If the student corresponds to yourself (assumed to be a specific student),
     *    and the university already contains this student, return a string listing all current semester courses.
     * 2. If the student corresponds to yourself, and the university doesn't contain the student,
     *    return the personal number from Argus (here, represented as a string).
     * 3. If the student is not yourself, return the student's info if the student is in the university, otherwise return null.
     *
     * @param s The student whose information needs to be retrieved.
     * @return A string with the requested info based on the predefined logic.
     */
    public String getStudentInfoStrange(Student s) {
        // Case 1: If this is the "myself" student, and they are already in the university
        if (s.getName().equals(myself.getName()) && s.getSurname().equals(myself.getSurname())) {
            if (students.contains(s)) {
                // Assuming courses for the current semester
                return "Current Semester Courses: Object Oriented Programming (ENG), Mathematical Foundation of Computing (ENG), Computer Organization (ENG), English Language Course C1-2 (ENG), Calculus II(ENG)";
            } else {
                return myself.getInfo(); // Return personal number if not in the university
            }
        }

        // Case 2: If this is not the "myself" student, return their info if they exist in the university
        if (students.contains(s)) {
            return s.getInfo();
        } else {
            return null; // If student is not in the university
        }
    }
}
