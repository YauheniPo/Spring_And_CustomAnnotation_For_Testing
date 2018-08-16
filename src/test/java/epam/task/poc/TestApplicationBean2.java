package epam.task.poc;

import epam.task.poc.bean_data.Database;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestApplicationBean2 {

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application_bean.xml");
        Database db = (Database)ctx.getBean("database");
        System.out.println(db.getPassword());
    }
}