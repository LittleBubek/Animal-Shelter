package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import engine.DataBaseConnection;

public class Buttons {
	JPanelShelter jps;
	DataBaseConnection connection = new DataBaseConnection();
	TextFields textFields = new TextFields();
	AnimalsList animalsList = new AnimalsList();
	JButton addAnimal = new JButton("Add");
	
	public void addButtons(JPanelShelter panel) {
		jps = panel;
		JButton updateAnimal = new JButton("Update");
		JButton deleteAnimal = new JButton("Delete");
		addAnimal.setBounds(25, 250, 75, 50);
		updateAnimal.setBounds(125, 250, 75, 50);
		deleteAnimal.setBounds(225, 250, 75, 50);
		jps.add(addAnimal);
		jps.add(updateAnimal);
		jps.add(deleteAnimal);
		
		JButton addPerson = new JButton("Add");
		JButton updatePerson = new JButton("Update");
		JButton deletePerson = new JButton("Delete");
		addPerson.setBounds(375, 250, 75, 50);
		updatePerson.setBounds(475, 250, 75, 50);
		deletePerson.setBounds(575, 250, 75, 50);
		jps.add(addPerson);
		jps.add(updatePerson);
		jps.add(deletePerson);
		
		
	}
}
