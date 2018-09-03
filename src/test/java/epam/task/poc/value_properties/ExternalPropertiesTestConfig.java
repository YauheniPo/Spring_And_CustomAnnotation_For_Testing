package epam.task.poc.value_properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(ignoreResourceNotFound = true, value = "classpath:test.properties")
public class ExternalPropertiesTestConfig {

}