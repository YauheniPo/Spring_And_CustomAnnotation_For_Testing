package epam.task.poc;

import epam.task.poc.value_properties.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

//@ContextConfiguration(classes = {ImportResourceValueProperties.class}, //application_bean #1
@ContextConfiguration(classes = {ImportResourceValueProperties.class, ExternalPropertiesFrmConfig.class, ExternalPropertiesTestConfig.class}, //application_bean #2
        loader = AnnotationConfigContextLoader.class)
public class TestValueProperties extends AbstractTestNGSpringContextTests {

    @Autowired
    private Environment env;

    @Autowired
    private Database2 database2;

    @Value("${test.value}")
    private String testValue;

    @Value("${frm.name}")
    private String frmName;

    @Value("${browser:chrome}")
    private String browser;

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        System.out.println(database2.getPassword());
    }
}