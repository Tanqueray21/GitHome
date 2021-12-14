/**
 * 
 */
package com.kclm.servlet.JDBCTemplate;

import java.sql.ResultSet;
import java.util.List;

/**
 * @author 张志杰
 * @param <T>
 * @ 2021年11月19日 下午3:32:21
 * @Descrptions
 */
@FunctionalInterface
public interface ResultSetExtractor<T> {

    List<T> handler(ResultSet rs) throws Exception;

}
