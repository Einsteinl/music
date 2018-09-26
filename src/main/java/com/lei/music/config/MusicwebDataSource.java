package com.lei.music.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class MusicwebDataSource {

    @Value("${musicweb.datasource.url}")
    private String url;

    @Value("${musicweb.datasource.username}")
    private String user;

    @Value("${musicweb.datasource.password}")
    private String password;

    @Value("${musicweb.datasource.driverClassName}")
    private String driverClass;


    @Bean(name="musicweb")
    @Primary
    @Qualifier("musicweb")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;

    }
    @Bean(name = "musicwebTransactionManager")
    @Primary
    public DataSourceTransactionManager musictwebTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}
