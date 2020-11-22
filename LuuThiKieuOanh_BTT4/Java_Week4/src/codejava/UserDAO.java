package codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	public User checkLogin(String username, String password) throws SQLException, 
			ClassNotFoundException {
		String jdbcURL = "jdbc:mysql://localhost:3306/newsdata?characterEncoding=latin1&useConfigs=maxPerformance";
		String dbUser = "root";
		String dbPassword = "";

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		String sql = "SELECT * FROM user WHERE username = ? and password = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, username);//colum1
		statement.setString(2, password);//colum2
		ResultSet result = statement.executeQuery();// thuc thi cau lenh r gan vao resultSet

		User user = null;

		if (result.next()) { // doc dong ke tiep
			user = new User();
			// gan gia tri doc duoc tu table
			user.setId(Integer.parseInt(result.getString("id")));
			user.setUsername(result.getString("username"));
			user.setFullname(result.getString("fullname"));
			user.setEmail(result.getString("email"));
			user.setPhone(result.getString("phone"));
			user.setRole(result.getString("role"));
			
		}
		statement.close();
		connection.close();

		return user;
	}
}
