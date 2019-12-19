package lab4;

import lab4.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

class UserService {

    static void findUserByName(int id, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "select * from oodb where jsonb = (?)"
        );
        preparedStatement.setString(1, String.valueOf(id));
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet.next());
    }
}
