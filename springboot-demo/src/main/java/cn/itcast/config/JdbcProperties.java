package cn.itcast.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

//@ConfigurationProperties(prefix = "jdbc")
//@Component
@Data
public class JdbcProperties {
//    private String driverClassName;
//    private String url;
//    private String username;
//    private String password;
    User user = new User();

    class User{
        private String name;
        private int age;
        List<String> language;
    }
}
