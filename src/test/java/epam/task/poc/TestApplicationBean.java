package epam.task.poc;

import epam.task.poc.bean_data.Database;
import epam.task.poc.bean_data.ImportResourceApplicationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = {ImportResourceApplicationBean.class},
    loader = AnnotationConfigContextLoader.class)
public class TestApplicationBean extends AbstractTestNGSpringContextTests {

    @Autowired
    private Environment env;

    @Autowired
    private Database database;

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        System.out.println(database.getPassword());
    }
}