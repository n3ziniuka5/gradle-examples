package lt.jug.kaunas.main;

import lt.jug.kaunas.config.Context;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Context.class)
public class MainIntegTest {
    @Resource
    Main main;

    @Test
    public void testInteg() {
        main.run();
        System.out.println("RESOURCE");
        System.out.println(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.txt"));
        Assert.assertEquals("a", "a");
    }
}
