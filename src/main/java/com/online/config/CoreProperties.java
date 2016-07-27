/**
 *整个项目的参数配置文件
 */
package com.online.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreProperties {

    //mysql配置
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String dbUsername;
    @Value("${spring.datasource.password}")
    private String dbPassword;
    @Value("${spring.datasource.driver-class-name}")
    private String dbDriver;
    @Value("${spring.datasource.connection-test-query}")
    private String dbTestQuery;


    //redis配置
    @Value("${spring.redis.host}")
    private String redisHostName;
    @Value("${spring.redis.password}")
    private String redisPassword;
    @Value("${spring.redis.port}")
    private int redisHostPort;
    @Value("${spring.redis.max-idle:10}")
    private int redisMaxIdle;
    @Value("${spring.redis.max-active:100}")
    private int redisMaxTotal;
    @Value("${spring.redis.max-wait:10000}")
    private int redisMaxWaitMillis;
    @Value("${spring.redis.timeout:5000}")
    private int redisTimeout;
    @Value("${spring.redis.testOnBorrow}")
    private boolean redisTestOnBorrow;
    @Value("${spring.redis.database}")
    private int redisCacheDatabase;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    public String getDbTestQuery() {
        return dbTestQuery;
    }

    public void setDbTestQuery(String dbTestQuery) {
        this.dbTestQuery = dbTestQuery;
    }

    public String getRedisHostName() {
        return redisHostName;
    }

    public void setRedisHostName(String redisHostName) {
        this.redisHostName = redisHostName;
    }

    public String getRedisPassword() {
        return redisPassword;
    }

    public void setRedisPassword(String redisPassword) {
        this.redisPassword = redisPassword;
    }

    public int getRedisHostPort() {
        return redisHostPort;
    }

    public void setRedisHostPort(int redisHostPort) {
        this.redisHostPort = redisHostPort;
    }

    public int getRedisMaxIdle() {
        return redisMaxIdle;
    }

    public void setRedisMaxIdle(int redisMaxIdle) {
        this.redisMaxIdle = redisMaxIdle;
    }

    public int getRedisMaxTotal() {
        return redisMaxTotal;
    }

    public void setRedisMaxTotal(int redisMaxTotal) {
        this.redisMaxTotal = redisMaxTotal;
    }

    public int getRedisMaxWaitMillis() {
        return redisMaxWaitMillis;
    }

    public void setRedisMaxWaitMillis(int redisMaxWaitMillis) {
        this.redisMaxWaitMillis = redisMaxWaitMillis;
    }

    public int getRedisTimeout() {
        return redisTimeout;
    }

    public void setRedisTimeout(int redisTimeout) {
        this.redisTimeout = redisTimeout;
    }

    public boolean isRedisTestOnBorrow() {
        return redisTestOnBorrow;
    }

    public void setRedisTestOnBorrow(boolean redisTestOnBorrow) {
        this.redisTestOnBorrow = redisTestOnBorrow;
    }

    public int getRedisCacheDatabase() {
        return redisCacheDatabase;
    }

    public void setRedisCacheDatabase(int redisCacheDatabase) {
        this.redisCacheDatabase = redisCacheDatabase;
    }
}
