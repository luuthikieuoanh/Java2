package crudDB;

import java.sql.SQLException;

public class ManageCategory {
	public static void main(String[] argv) throws SQLException {
		CategoryDAO manage=new CategoryDAO();
		manage.insert("Giai tri");
	}
}
