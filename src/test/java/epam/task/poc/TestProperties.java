package epam.task.poc;

import epam.task.poc.conf_properties.Database;
import epam.task.poc.conf_properties.ImportResourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = {ImportResourceProperties.class},
    loader = AnnotationConfigContextLoader.class)
@EnableConfigurationProperties(Database.class)
public class TestProperties extends AbstractTestNGSpringContextTests {

    @Autowired
    private Environment env;

    @Autowired
    private Database database2;

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        System.out.println(database2.getPassword());
    }
}