package epam.task.poc.conf_properties_test;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "my.properties")
public class MyConfigurationProperties {

    @NotNull
    private String testValue = "default value";
}