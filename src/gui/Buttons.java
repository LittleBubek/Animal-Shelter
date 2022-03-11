package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import engine.DataBaseConnection;

public class Buttons {
	JPanelShelter jps;
	DataBaseConnection connection = new DataBaseConnection();
	TextFields textFields = new TextFields();
	JButton addAnimal = new JButton("Add");
	JButton addPerson = new JButton("Add");
	
	public void addButtons(JPanelShelter panel) {
		jps = panel;
		addAnimal.setBounds(25, 250, 75, 50);
		jps.add(addAnimal);
		
		addPerson.setBounds(375, 250, 75, 50);
		jps.add(addPerson);
		
		
	}
}
