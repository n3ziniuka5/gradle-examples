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
    public void testInteg() throws Exception {
        main.run();
        Assert.assertEquals("a", "a");
    }
}
