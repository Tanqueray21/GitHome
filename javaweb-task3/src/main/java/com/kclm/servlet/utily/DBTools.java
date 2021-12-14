/**
 * 
 */
package com.kclm.servlet.utily;

import java.sql.Connection;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author 张志杰
 * @ 2021年11月19日 下午2:38:36
 * @Descrptions
 */
public class DBTools {
    //
    private static DruidAbstractDataSource dataSource;

    // 初始化dataSource
    static {
        dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/servlet?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT&useSSL=false");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        //
        dataSource.setInitialSize(2);
        dataSource.setMaxActive(5);
        dataSource.setMaxWait(3000);
        dataSource.setMinIdle(1);
    }

    public static Connection getConnection() throws Exception {
        return dataSource == null?null : dataSource.getConnection();
    }
    
    
    /**
     * 释放连接池
     */
    
    public static void release() {
        if(dataSource != null) {
            dataSource.closePreapredStatement(null);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getConnection());
    }

}
