package threads;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton singleton = Singleton.getInstance("Siri");
        Assert.assertEquals("Siri", singleton.getData());
        Singleton singleton1 = Singleton.getInstance("second");
        Assert.assertEquals("Siri", singleton1.getData());
    }
}
