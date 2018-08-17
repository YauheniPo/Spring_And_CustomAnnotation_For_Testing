package epam.task.poc.value_properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(ignoreResourceNotFound = true, value = "classpath:conf/frm.properties")
public class ExternalPropertiesFrmConfig {

}