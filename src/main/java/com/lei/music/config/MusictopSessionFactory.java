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
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = MusictopSessionFactory.PACKAGE,sqlSessionFactoryRef = "musictopSqlSessionFactory")
@ToString
public class MusictopSessionFactory {

    // 精确到 musictop 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.lei.music.dao.musictop";
    static final String MAPPER_LOCATION = "classpath:mapper/musictop/*.xml";



    @Bean(name = "musictopSqlSessionFactory")
    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("musictop") DataSource musictopDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(musictopDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MusictopSessionFactory.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
