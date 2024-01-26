package collections;

import org.junit.Assert;
import org.junit.Test;

public class StudentInformationTest {
    StudentInformation studentInformation = new StudentInformation();
    @Test
    public void testStudentInformation() {
        Student student = studentInformation.getStudentInfo("Siri");
        Assert.assertNotNull(student);
        Assert.assertEquals("A", student.getLastName());
    }
}
