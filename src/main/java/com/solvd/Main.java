package com.solvd;

import com.solvd.DAO.IConnectionPool;
import com.solvd.DAO.IRegionDAO;
import com.solvd.DAO.jdbcMySqlImpl.ConnectionPool;
import com.solvd.DAO.jdbcMySqlImpl.RegionDAO;
import org.apache.log4j.Logger;

import java.sql.SQLException;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(RegionDAO.class);

    public static void main(String[] args) {
        try {
            IConnectionPool connectionPool = ConnectionPool.getInstance("jdbc:mysql://localhost:3306/UniversityDB", "root", "root");
            IRegionDAO bonusesDAO = new RegionDAO(connectionPool);
            LOGGER.info(bonusesDAO.getById(4).toString());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
