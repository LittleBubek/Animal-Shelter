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
	JButton adopt = new JButton("Adoption");
	JButton update = new JButton("Update");
	JButton delete = new JButton("Delete");
	
	public void addButtons(JPanelShelter panel) {
		jps = panel;
		addAnimal.setBounds(25, 250, 75, 50);
		jps.add(addAnimal);
		
		addPerson.setBounds(375, 250, 75, 50);
		jps.add(addPerson);
		
		adopt.setBounds(1050, 415, 100, 50);
		jps.add(adopt);
		
		update.setBounds(1050, 475, 100, 50);
		jps.add(update);
		
		delete.setBounds(1050, 585, 100, 50);
		jps.add(delete);
		
		
	}
}
