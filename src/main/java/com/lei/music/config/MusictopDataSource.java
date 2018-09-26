package com.lei.music.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import javax.sql.DataSource;

@Configuration
public class MusictopDataSource {

    @Value("${musictop.datasource.url}")
    private String url;

    @Value("${musictop.datasource.username}")
    private String user;

    @Value("${musictop.datasource.password}")
    private String password;

    @Value("${musictop.datasource.driverClassName}")
    private String driverClass;


    @Bean(name="musictop")
    @Qualifier("musictop")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean(name = "musictopTransactionManager")
    public DataSourceTransactionManager musictopTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}
