package com.base.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;

// This class is used for creating connection with database
public class DButil {
    private static final ComboPooledDataSource cpds;

    static {
        cpds = new ComboPooledDataSource();
        cpds.setJdbcUrl("jdbc:postgresql://satao.db.elephantsql.com:5432/nynlzcoy");
        cpds.setUser("nynlzcoy");
        cpds.setPassword("A8xMnhPbXo87Us6XgNJ9B2R4AIxxjJmX");
        cpds.setMaxPoolSize(5);
        cpds.setMinPoolSize(1);
    }

    public static Connection getConnection(String methodName) {
        try {
            System.out.println("Connection acquired for method : " + methodName);
            return cpds.getConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection conn, String methodName) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed for method : " + methodName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int shutdownCPDS() {
        cpds.setAutoCommitOnClose(true);
        cpds.close();
        System.out.println("DataBase successfully Closed.....");
        return 1;
    }
}

