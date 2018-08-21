package epam.task.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
//@PropertySource(ignoreResourceNotFound = true, value = "classpath:conf/frm.properties")
@ImportResource("application_bean.xml")
public class MainValueProperties {

    @Bean
    MyBean myBean() {
        return new MyBean();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainValueProperties.class, args);
        MyBean myBean = context.getBean(MyBean.class);
        myBean.startApplication();
    }

    private static class MyBean {

        @Value("${frm.name}")
        private String appTitle;

        public void startApplication() {
            System.out.printf(appTitle);
        }
    }
}