package com.solvd.DAO;

import java.sql.Connection;

public interface IConnectionPool {
    Connection getConnection();

    boolean releaseConnection(Connection connection);
}
