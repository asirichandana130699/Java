package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class RotationTest {
    Rotation rotation = new Rotation();
    @Test
    public void testStringRotation() {
        Assert.assertTrue(rotation.isStringRotated("elloworldh", "helloworld"));
    }

}
