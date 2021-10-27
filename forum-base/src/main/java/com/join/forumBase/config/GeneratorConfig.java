package com.join.forumBase.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

//@PropertySource({"generatorConfig.properties"})
@Data
@ToString
public class GeneratorConfig {

    public GeneratorConfig() {
        this.url = "jdbc:mysql://localhost:3306/db_bbs?serverTimezone=UTC";
        this.username = "root";
        this.password = "123456";
    }


//    @Value("url")
    private String url;
//    @Value("username")
    private String username;
//    @Value("password")
    private String password;



}
