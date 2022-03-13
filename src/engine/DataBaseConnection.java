package engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gui.JPanelShelter;
import gui.TextFields;

public class DataBaseConnection {
	TextFields textFields = new TextFields();
	
	public void connectDatabase() {

	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("DROP TABLE IF EXISTS Animals");
		stmt.executeUpdate("DROP TABLE IF EXISTS People");
		stmt.executeUpdate("DROP TABLE IF EXISTS Adoptions");
		stmt.executeUpdate("CREATE TABLE Animals (ID SERIAL PRIMARY KEY, Name varchar(30), Species varchar(30), Age int)");
		stmt.executeUpdate("CREATE TABLE People (ID SERIAL PRIMARY KEY, Name varchar(30), Animal varchar(30), Address varchar(50))");
		stmt.executeUpdate("CREATE TABLE Adoptions (ID SERIAL PRIMARY KEY, PersonName varchar(30), AnimalName varchar(30), Species varchar(50))");
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
	
	public void updateAdoptions(String personName, String animalName, String species, int addOrUpdate, String ID) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
			Statement stmt = conn.createStatement();
			ResultSet rsPerson = stmt.executeQuery(personName);
			while (rsPerson.next()) {
				personName = rsPerson.getString(1);
			}
			
			ResultSet rsAnimal = stmt.executeQuery(animalName);
			while (rsAnimal.next()) {
				animalName = rsAnimal.getString(1);
			}
			
			ResultSet rsSpecies = stmt.executeQuery(species);
			while (rsSpecies.next()) {
				species = rsSpecies.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(addOrUpdate == 1)
			newAdoption(personName, animalName, species);
		else if(addOrUpdate == 2)
			changeAdoptions(personName, animalName, species, ID);
		else
			delete(personName, animalName, species, ID);
	}
	
	public void newAdoption(String personName, String animalName, String species) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
			Statement stmt = conn.createStatement();
			String adoption = "INSERT INTO Adoptions VALUES (DEFAULT, '"+ personName +"', '"
					+ animalName +"', '"+ species +"');";
			stmt.executeUpdate(adoption);
			JPanelShelter.modelTableAdoptions.setRowCount(0);
			ResultSet rsAdoption = stmt.executeQuery("SELECT * FROM Adoptions ORDER BY ID ASC");
			while (rsAdoption.next()) {
				JPanelShelter.modelTableAdoptions.addRow(new Object[] {rsAdoption.getString(1), rsAdoption.getString(2), rsAdoption.getString(3), rsAdoption.getString(4)});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeAdoptions(String personName, String animalName, String species, String ID) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
			Statement stmt = conn.createStatement();
			String update = "UPDATE Adoptions SET PersonName = '" + personName + "', AnimalName = '"+animalName + "', Species = '" + species + "' WHERE ID = "+ ID; 
			stmt.executeUpdate(update);
			ResultSet rsAdoption = stmt.executeQuery("SELECT * FROM Adoptions ORDER BY ID ASC");
			JPanelShelter.modelTableAdoptions.setRowCount(0);
			while (rsAdoption.next()) {
				JPanelShelter.modelTableAdoptions.addRow(new Object[] {rsAdoption.getString(1), rsAdoption.getString(2), rsAdoption.getString(3), rsAdoption.getString(4)});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(String personName, String animalName, String species, String ID) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Animal","postgres", "admin");
			Statement stmt = conn.createStatement();
			String update = "DELETE FROM Adoptions WHERE ID = " + ID; 
			stmt.executeUpdate(update);
			ResultSet rsAdoption = stmt.executeQuery("SELECT * FROM Adoptions ORDER BY ID ASC");
			JPanelShelter.modelTableAdoptions.setRowCount(0);
			while (rsAdoption.next()) {
				JPanelShelter.modelTableAdoptions.addRow(new Object[] {rsAdoption.getString(1), rsAdoption.getString(2), rsAdoption.getString(3), rsAdoption.getString(4)});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

