package com.bertugkuturoglu.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

//@Getter
//@Setter
//@Component // Bean olussun diye yapiyoruz

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class GlobalProperties {

    private List<Server> servers;

//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//
//    @Value("${spring.datasource.password}")
//    private String password;
}
