package string;

import org.junit.Assert;
import org.junit.Test;

public class TestRotationWord {
    @Test
    public void testCheckRotation() {
        RotationWord stringRotation = new RotationWord();
        boolean output = stringRotation.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee");
        Assert.assertTrue(output);
    }

    @Test
    public void testCheckRotationFailure() {
        RotationWord stringRotation = new RotationWord();
        Assert.assertFalse(stringRotation.isRotation("JavaJ2eeStrutsHibernate", "JavJ2eeStrutsHibernate"));
    }
}
