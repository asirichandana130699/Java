package exception;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("C:\\Users\\chand\\Downloads\\Day02\\src\\main\\resources\\Data.txt");
        Assert.assertEquals("HelloI am Siri Chandana", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}
