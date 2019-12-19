package supermarket.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Init_DataBase {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/db_supermarket?verifyServerCertificate=false&useSSL=false";
    private static String user = "root";
    private static String password = "123456";

    public static void exec_shellsql(){
        try {
            Class.forName(driver).newInstance();
            Connection conn = (Connection) DriverManager.getConnection(url,user,password);
            conn.setAutoCommit(false);
            ScriptRunner runner = new ScriptRunner(conn);
            runner.setAutoCommit(false);
            runner.setErrorLogWriter(null);
            runner.setLogWriter(null); //定义日志输出

            /***
             *
             //遇到错误停止
             runner.setStopOnError(true);
             //定义命令间的分隔符
             runner.setDelimiter(";");
             runner.setFullLineDelimiter(false);
             //定义日志输出
             //runner.setLogWriter(null);
             */
            runner.runScript(Resources.getResourceAsReader("db_supermarket.sql"));
            conn.commit();
            conn.close();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
