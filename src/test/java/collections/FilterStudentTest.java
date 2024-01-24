package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FilterStudentTest {
    FilterStudentsByGPA studentsByGPA = new FilterStudentsByGPA();
    @Test
    public void testRemoveStudent() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Siri", "A", 3.7));
        students.add(new Student("Chandana", "B", 3.8));
        students.add(new Student("Siri", "C", 3.6));
        students = studentsByGPA.getStudentData(students);
        Assert.assertEquals(2, students.size());
    }
}
