package epam.task.poc.value_properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource(ignoreResourceNotFound = true, value = "classpath:database.properties")
public class Database2 {

    @Value("${database.url}")
    public String url;
    @Value("${database.username}")
    public String username;
    @Value("${database.password}")
    public String password;
}