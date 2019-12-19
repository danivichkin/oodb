package lab4;


import com.google.gson.Gson;
import lab4.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class SaveDB {

    static void saveUserList(List<User> users, Connection connection) throws SQLException{

        int count = 0;

        for (int i = 0; i <= users.size()-1; i++) {
            Gson gson = new Gson();
            String userAsJson = gson.toJson(users.get(i));
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into oodb (json , jsonb) values (cast (? as json), cast(? as jsonb))"
            );

            long start = System.nanoTime();
            preparedStatement.setString(1, userAsJson);
            long end = System.nanoTime();
            System.out.println("JSON: " + (end - start));

            start = System.nanoTime();
            preparedStatement.setString(2, userAsJson);
            end = System.nanoTime();
            System.out.println("JSONB: " + (end - start));

            count = i;
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        System.out.println((count + 1) + " records added");
    }
}
