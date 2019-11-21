package lab4;


import com.google.gson.Gson;
import lab4.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SaveDB {

    public static void saveUserList(List<User> users, Connection connection) throws SQLException{
        if (users != null && users.size()>0){
            Gson gson = new Gson();
            String userAsJson = gson.toJson(users);
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into jtest (connect , connectb) values (cast (? as json)  )"
            );
            preparedStatement.setString(1, userAsJson);
            preparedStatement.setString(1, userAsJson); //TODO

            int count = preparedStatement.executeUpdate();
            System.out.println(count + "records added");
            preparedStatement.close();
        }
    }
}
