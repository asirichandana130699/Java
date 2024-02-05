package streams;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    Add add = new Add();
    @Test
    public void testAdd() {
        Assert.assertEquals(6, add.operation.operate(3, 3));
    }
}
