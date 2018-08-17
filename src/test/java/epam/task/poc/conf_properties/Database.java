package epam.task.poc.conf_properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(ignoreInvalidFields = true)
public class Database {

    public String url;
    public String username;
    public String password;
}