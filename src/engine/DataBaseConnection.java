package engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gui.AnimalsList;

public class DataBaseConnection {
	
	public void connectDatabase(String update) {
	String queryAnimal = "SELECT * FROM Animals";
	String queryPeople = "SELECT * FROM People";
	AnimalsList animalsList = new AnimalsList();

	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(update);
//		ResultSet rsAnimal = stmt.executeQuery(queryAnimal);
//		ResultSet rsPeople = stmt.executeQuery(queryPeople);
//		while (rsAnimal.next()) {
//             // System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//              
//		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

