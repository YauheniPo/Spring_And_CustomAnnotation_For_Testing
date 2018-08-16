package epam.task.poc.bean_data;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("database")
public class Database {

    public String url;
    public String username;
    public String password;
}