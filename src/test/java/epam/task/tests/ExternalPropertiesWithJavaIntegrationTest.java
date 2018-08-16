package epam.task.tests;

import epam.task.external.Database;
import epam.task.external.ExternalSpringConfig;
import epam.task.external.properties.ExternalPropertiesTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

//@RunWith(SpringJUnit4ClassRunner.class)
//@Ignore
@ContextConfiguration(classes = {ExternalSpringConfig.class, ExternalPropertiesTestConfig.class},
    loader = AnnotationConfigContextLoader.class)

//@EnableConfigurationProperties(Database.class) //# 2
public class ExternalPropertiesWithJavaIntegrationTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private Environment env;

    @Autowired
    private Database database;

    @Value("${test.value}")
    private String testValue;

    @Value("${frm.name}")
    private String frmName;

    @Value("${browser:chrome}")
    private String browser;

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application_bean.xml");
        Database db = (Database)ctx.getBean("database");

        System.out.println(testValue);
        System.out.println(env.getProperty("test.value"));
        System.out.println(frmName);
        System.out.println(((StandardEnvironment) env).getPropertySources().get("systemProperties").getProperty("os.name"));
        System.out.println(browser);
    }
}