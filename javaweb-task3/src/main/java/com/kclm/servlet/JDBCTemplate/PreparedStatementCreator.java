/**
 * 
 */
package com.kclm.servlet.JDBCTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author 张志杰
 * @ 2021年11月19日 下午3:31:23
 * @Descrptions
 */
@FunctionalInterface
public interface PreparedStatementCreator {

    PreparedStatement preparedStatement(Connection conn) throws Exception;

}
