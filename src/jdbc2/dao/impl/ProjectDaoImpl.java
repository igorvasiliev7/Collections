package jdbc2.dao.impl;


import jdbc2.dao.ProjectDao;
import jdbc2.datasource.DatabaseSource;
import jdbc2.model.Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {

    private static final String INSERT = "INSERT INTO projects (name) VALUES (?)";

    /**
     * {@inheritDoc}.
     */
    @Override
    public void save(Project project) {
            try (Connection connection = DatabaseSource.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
                preparedStatement.setString(1, project.getName());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

}
