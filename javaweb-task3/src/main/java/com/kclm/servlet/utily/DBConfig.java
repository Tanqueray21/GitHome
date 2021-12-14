/**
 * 
 */
package com.kclm.servlet.utily;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 张志杰
 * @ 2021年11月19日 下午3:10:42
 * @Descrptions
 */
public class DBConfig {

    //
    private static Properties props;

    static {
        // 通过类加载器实现对文件的加载
        InputStream is = DBConfig.class.getClassLoader().getResourceAsStream("druid.properties");
        // 创建Properties对象:专门用来解析properties文件
        Properties p = new Properties();
        // 加载这个流,自动会把properties文件的数据生成K-V键值对
        try {
            p.load(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static String getValue(String key) {
        return props.getProperty(key);
    }

}
