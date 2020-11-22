package net.codejava;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileUploadDAO {
	private static final String url = "jdbc:mysql://localhost:3306/qltintuc?characterEncoding=latin1&useConfigs=maxPerformance";
    private static final String user = "root";
    private static final String password = "";

    private static final String sql = "INSERT INTO news (title, image, content) values (?, ?, ?)";

    public int uploadFile(String title, InputStream image, String content) {
        int row = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection connection = DriverManager
            .getConnection(url, user, password);
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement(sql)) {

            preparedStatement.setString(1, title);
            preparedStatement.setString(3, content);
            if (image != null) {
                // fetches input stream of the upload file for the blob column
                preparedStatement.setBlob(2, image);
            }

            // sends the statement to the database server
            row = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
}
