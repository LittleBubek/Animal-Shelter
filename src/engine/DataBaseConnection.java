package engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gui.JPanelShelter;

public class DataBaseConnection {
	public void connectDatabase() {

	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("DROP TABLE IF EXISTS Animals");
		stmt.executeUpdate("DROP TABLE IF EXISTS People");
		stmt.executeUpdate("CREATE TABLE Animals (ID SERIAL PRIMARY KEY, Name varchar(30), Species varchar(30), Age int)");
		stmt.executeUpdate("CREATE TABLE People (ID SERIAL PRIMARY KEY, Name varchar(30), Animal varchar(30), Address varchar(50))");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void addAnimalToDatabase(String query) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			ResultSet rsAnimal = stmt.executeQuery("SELECT * FROM Animals");
			JPanelShelter.t1.setRowCount(0);
			while (rsAnimal.next()) {
				JPanelShelter.t1.addRow(new Object[] {rsAnimal.getString(1), rsAnimal.getString(2), rsAnimal.getString(3), rsAnimal.getString(4)});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addPersonToDatabase(String query) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			ResultSet rsPerson = stmt.executeQuery("SELECT * FROM People");
			JPanelShelter.modelTablePeople.setRowCount(0);
			while (rsPerson.next()) {
				JPanelShelter.modelTablePeople.addRow(new Object[] {rsPerson.getString(1), rsPerson.getString(2), rsPerson.getString(3), rsPerson.getString(4)});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

