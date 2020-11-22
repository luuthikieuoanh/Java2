package net.codejava;

import java.sql.*;

public class UserDAO {
	public User checkLogin(String username, String password) throws SQLException,
    ClassNotFoundException {
String jdbcURL = "jdbc:mysql://localhost:3306/qltintuc?characterEncoding=latin1&useConfigs=maxPerformance";
String dbUser = "root";
String dbPassword = "";

Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
String sql = "SELECT * FROM users WHERE username = ? and password = ?";
PreparedStatement statement = connection.prepareStatement(sql);
statement.setString(1, username);
statement.setString(2, password);

ResultSet result = statement.executeQuery();

User user = null;

if (result.next()) {
    user = new User();
    user.setName(result.getString("name"));
    user.setEmail(result.getString("email"));
}

connection.close();

return user;
}
	}
