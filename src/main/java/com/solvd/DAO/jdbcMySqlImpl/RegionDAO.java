package com.solvd.DAO.jdbcMySqlImpl;

import com.solvd.DAO.IConnectionPool;
import com.solvd.DAO.IRegionDAO;
import com.solvd.DAO.entities.Region;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegionDAO implements IRegionDAO{
    private static final Logger LOGGER = Logger.getLogger(RegionDAO.class);

    private final IConnectionPool connectionPool;

    public RegionDAO(IConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public Region getById(Integer id) {
        Connection connection = connectionPool.getConnection();
        Region region = null;

        try {
            String sql = "SELECT * FROM Regions";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            result.next();
            region = new Region();
            region.setId(result.getInt("id"));
            region.setName(result.getString("name"));
        } catch(SQLException ex) {
            LOGGER.error(ex.getMessage());
        } finally {
            connectionPool.releaseConnection(connection);
        }
        return region;
    }

    @Override
    public void insert(Region entity) {

    }

    @Override
    public void update(Region entity) {

    }

    @Override
    public void delete(Integer id) {

    }
}
