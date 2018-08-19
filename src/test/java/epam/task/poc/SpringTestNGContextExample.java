package epam.task.poc;

import epam.task.poc.bean_data.Database;
import epam.task.poc.bean_data.ImportResourceApplicationBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@ContextConfiguration(classes = {ImportResourceApplicationBean.class},
        loader = AnnotationConfigContextLoader.class)
public class SpringTestNGContextExample extends AbstractTestNGSpringContextTests {

    @Autowired
    private Environment env;

    @Autowired
    private BeanFactory beanFactory;

    @Autowired
    private Database database;

    @Value("${frm.name}")
    private String frmName;

    @BeforeClass //!!!!
    private void saveFooName() {
        System.out.println(database.getPassword());
    }

    @Test(dependsOnMethods = {"removeFromCache"})
    public void verifyContextNew() {
        System.out.println(database.getUsername());
    }

    @Test
    @DirtiesContext
    public void removeFromCache() {
        System.out.println(database.getUrl());
    }
}