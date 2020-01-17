package guru.springframework.test.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import guru.test.config.external.props.ExternalPropsPropertySourceTestConfig;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsPropertySourceTestConfig.class)
public class PropertySourceTest {

    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() throws Exception {
        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Harley", fakeJmsBroker.getUser());
        assertEquals("Davidson", fakeJmsBroker.getPassword());
    }
}