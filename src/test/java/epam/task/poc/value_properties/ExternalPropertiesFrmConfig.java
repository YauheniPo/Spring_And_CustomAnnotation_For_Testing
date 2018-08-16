package epam.task.poc.value_properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:conf/frm.properties")
public class ExternalPropertiesFrmConfig {

}