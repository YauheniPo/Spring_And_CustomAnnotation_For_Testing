package epam.task.external;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data

//@Component //# 1
//@PropertySource("classpath:database.properties") //#1
@ConfigurationProperties("database") //# 2
public class Database {

//    @Value("${database.url}") //#1
    public String url;
//    @Value("${database.username}") //#1
    public String username;
//    @Value("${database.password}") //#1
    public String password;
}