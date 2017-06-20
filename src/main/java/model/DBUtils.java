package model;

import java.sql.*;

public class DBUtils {

    private Connection conn;

    public DBUtils() {
        try {
            String database =
                    "jdbc:ucanaccess://C:\\Users\\windows\\IdeaProjects\\forum-system\\src\\model\\data_base\\forums.accdb";
            conn = DriverManager.getConnection(database, "", "");
        } catch (Exception e) {
            //print to logger
            int i = 0;
        }
    }

    public ResultSet select(String quey) {
        ResultSet rs = null;
        try {
            Statement s = conn.createStatement();
            s.execute(quey);
            rs = s.getResultSet();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    public boolean insert(String quey) {
        boolean ans = false;
        try {
            Statement s = conn.createStatement();
            s.execute(quey);
            ans = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ans;
    }
}
