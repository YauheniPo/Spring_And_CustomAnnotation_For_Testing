package epam.task.external.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ImportResource("classpath:test.xml")
@PropertySource("classpath:test.properties")
//@ComponentScan("org.baeldung.core")
public class ExternalPropertiesTestConfig {

}