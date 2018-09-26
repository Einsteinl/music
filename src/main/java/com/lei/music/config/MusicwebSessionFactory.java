package com.lei.music.config;

import lombok.ToString;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
@Configuration
//扫描Mapper接口并容器管理
@MapperScan(basePackages = MusicwebSessionFactory.PACKAGE,sqlSessionFactoryRef = "musicwebSqlSessionFactory")
@ToString
public class MusicwebSessionFactory {


    static final String PACKAGE = "com.lei.music.dao.musicweb";
    static final String MAPPER_LOCATION = "classpath:mapper/musicweb/*.xml";



    @Bean(name = "musicwebSqlSessionFactory")
    @Primary
    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("musicweb") DataSource musicwebDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(musicwebDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MusicwebSessionFactory.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
