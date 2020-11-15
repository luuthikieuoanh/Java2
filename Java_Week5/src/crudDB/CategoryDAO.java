package crudDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryDAO {
	
	
	private static final String SELECT_CATEGORY_BY_ID = "select id,name from categories where id =?";
	private static final String SELECT_ALL_CATEGORY = "select * from categories";
	private static final String DELETE_CATEGORY_SQL = "delete from categories where id = ?;";
	private static final String UPDATE_CATEGORY_SQL = "update categories set name = ? where id = ?;";
	private static final String INSERT_CATEGORY_SQL = "INSERT INTO categories" + "  (name) VALUES " + " (?);";

	public CategoryDAO() {
		
	}
	
	public void insert(String name) throws SQLException {
		System.out.println(INSERT_CATEGORY_SQL);

		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CATEGORY_SQL)) {
			preparedStatement.setString(1, name);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
	}

	public void update(String name) throws SQLException {
		System.out.println(UPDATE_CATEGORY_SQL);

		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CATEGORY_SQL)) {
			preparedStatement.setString(1, name);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
	}

	public void selectAll(String name) throws SQLException {
		System.out.println(SELECT_ALL_CATEGORY);

		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CATEGORY_SQL)) {
			preparedStatement.setString(1, name);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
	}

	public void selectById(String name) throws SQLException {
		System.out.println(SELECT_CATEGORY_BY_ID);

		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CATEGORY_SQL)) {
			preparedStatement.setString(1, name);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
	}

	public static void delete(int id) throws SQLException {
		System.out.println(DELETE_CATEGORY_SQL);

		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CATEGORY_SQL)) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
	}
}