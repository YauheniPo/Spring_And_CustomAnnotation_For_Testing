package epam.task.poc;

import epam.task.poc.conf_properties_test.MyConfigurationProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { ConfigurationPropertiesTest.TestConfiguration.class })
@ActiveProfiles("test_prop")
public class ConfigurationPropertiesTest {

    @Autowired
    private MyConfigurationProperties properties;

    @Test
    public void should_Populate_MyConfigurationProperties() {
        System.out.println(properties.getTestValue());
    }

    @EnableConfigurationProperties(MyConfigurationProperties.class)
    public static class TestConfiguration {
        // nothing
    }
}