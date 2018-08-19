package epam.task.poc;

import epam.task.poc.conf_properties_test.MyConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest(classes = {ConfigurationPropertiesTestNG.TestConfiguration.class})
@ActiveProfiles("test_prop")
public class ConfigurationPropertiesTestNG extends AbstractTestNGSpringContextTests {

    @Autowired
    private MyConfigurationProperties properties;

    @BeforeTest
    public void before() {
        System.out.println();
    }

    @Test
    public void should_Populate_MyConfigurationProperties() {
        System.out.println(properties);
    }

    @EnableConfigurationProperties(MyConfigurationProperties.class)
    public static class TestConfiguration {
        // nothing
    }
}