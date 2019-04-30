package com.itxiaoer.demo.mybatis;

import com.itxiaoer.demo.mybatis.mapper.SystemMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

/**
 * @author : liuyk
 */
public class Main {

    public static void main(String[] args) {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setPassword("1qaz3edc");
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);

        configuration.addMappers("com.itxiaoer.demo.mybatis.mapper");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        SqlSession session = sqlSessionFactory.openSession();

        SystemMapper mapper = session.getMapper(SystemMapper.class);


        System.out.println(mapper);

    }
}
