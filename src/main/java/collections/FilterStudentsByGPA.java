package collections;

import java.util.ArrayList;

public class FilterStudentsByGPA {

    public ArrayList<Student> getStudentData(ArrayList<Student> students) {
        double totalGPA = 0.0;
        for(Student student : students)
            totalGPA += student.getGpa();
        double averageGPA = calculateAverageGPA(students);
        ArrayList<Student> removeList = new ArrayList<>();
        for(Student student : students) {
            if(student.getGpa() < averageGPA)
                removeList.add(student);
        }
        students.removeAll(removeList);
        return students;
    }

    // Method to calculate average GPA
    private double calculateAverageGPA(ArrayList<Student> students) {
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGpa();
        }
        return students.isEmpty() ? 0 : totalGPA / students.size();
    }

}
