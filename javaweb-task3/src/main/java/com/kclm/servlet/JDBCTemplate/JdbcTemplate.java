/**
 * 
 */
package com.kclm.servlet.JDBCTemplate;

import com.kclm.servlet.utily.DBTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;



/**
 * @author 张志杰
 * @ 2021年11月19日 下午3:34:26
 * @Descrptions
 */
public class JdbcTemplate {

    //
    public final int update(StatementCreator sc, String sql) {
        try (Connection conn = DBTools.getConnection();) {

            //
            Statement stmt = sc.createStatement(conn);
            //
            return stmt.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public final int update(PreparedStatementCreator psc) {
        try (Connection conn = DBTools.getConnection();) {
            //
            PreparedStatement pstmt = psc.preparedStatement(conn);
            //
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //
        return -1;
    }

    public final <T> T queryOne(PreparedStatementCreator psc, ResultSetExtractor<T> rse) {
        List<T> result = queryList(psc, rse);
        if (result != null && result.size() > 0) {
            return queryList(psc, rse).get(0);
        }
        //
        return null;
    }

    public final <T> List<T> queryList(PreparedStatementCreator psc, ResultSetExtractor<T> rse) {

        //
        try (Connection conn = DBTools.getConnection();) {
            //
            PreparedStatement pstmt =  psc.preparedStatement(conn);
            //
            ResultSet rs = pstmt.executeQuery();
            //
            return rse.handler(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
