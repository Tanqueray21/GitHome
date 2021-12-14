/**
 * 
 */
package com.kclm.servlet.JDBCTemplate;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author 张志杰
 * @ 2021年11月19日 下午3:30:18
 * @Descrptions
 */
@FunctionalInterface
public interface StatementCreator {

    Statement createStatement(Connection conn) throws Exception;

}
