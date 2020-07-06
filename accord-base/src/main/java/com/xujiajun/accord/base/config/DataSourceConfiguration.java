package com.xujiajun.accord.base.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Configuration
@MapperScan(basePackages = {"com.xujiajun.accord.base.dao"}, sqlSessionTemplateRef = "sqlSessionTemplate")
public class DataSourceConfiguration {

	private static final String MAPPER_LOCATION = "classpath*:com/xujiajun/accord/base/mapper/*.xml";

	@Bean(value = "dataSource")
	@ConfigurationProperties(prefix = "accord-base.data-source")
	public DataSource dataSource() {
		return new DruidDataSource();
	}

	@Bean(value = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources(MAPPER_LOCATION);
		sqlSessionFactoryBean.setMapperLocations(resources);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean(value = "sqlSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
