package level2.lesson8.database;

import level2.lesson8.server.AuthenticationService.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {


    public List<CredentialsEntry> findAll() {
        Connection connection = ConnectionService.connect();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM USER");

            ResultSet rs = statement.executeQuery();
            List<CredentialsEntry> users = new ArrayList<>();

            while (rs.next()) {
                users.add(
                        new CredentialsEntry(
                                rs.getString("login"),
                                rs.getString("pass"),
                                rs.getString("nickName"))

                );
            }

            return users;
        } catch (SQLException e) {
            throw new RuntimeException("SWW", e);
        } finally {
            ConnectionService.close(connection);
        }
    }

    public CredentialsEntry findByName(String name) {
        Connection connection = ConnectionService.connect();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM USER WHERE NAME = ?");
            statement.setString(1, name);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return new CredentialsEntry(
                        rs.getString("login"),
                        rs.getString("pass"),
                        rs.getString("nickName")
                );
            }

            return null;
        } catch (SQLException e) {
            throw new RuntimeException("SWW", e);
        } finally {
            ConnectionService.close(connection);
        }
    }

    public void updateUser(String newName, String oldName) {
        Connection connection = ConnectionService.connect();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE USER SET nickName=? " +
                    "WHERE nickName=?");
            statement.setString(1, newName);
            statement.setString(2, oldName);
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("SWW", e);
        } finally {
            ConnectionService.close(connection);
        }
    }
}