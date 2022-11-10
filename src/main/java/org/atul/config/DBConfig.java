package org.atul.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    /**
     *
     * spring.r2dbc.url=r2dbc:postgresql://172.17.0.2:5432/postgres?schema=techwriting
     * spring.r2dbc.username=<username>
     * spring.r2dbc.password=<password>
     * @return
     */
    @Bean
    public DataSource getDataSource(){

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("r2dbc:postgresql://172.17.0.2:5432/postgres?schema=techwriting");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("test");
        return dataSourceBuilder.build();

    }
}
