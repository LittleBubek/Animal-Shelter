package gui;

import javax.swing.JTextField;

public class TextFields {
	JPanelShelter jps;
	JTextField animalName = new JTextField();
	JTextField animalSpecies = new JTextField();
	JTextField animalAge = new JTextField();
	JTextField personName = new JTextField();
	JTextField whichAnimal = new JTextField();
	JTextField personAddress = new JTextField();
	public void addTextFields(JPanelShelter panel) {
		jps = panel;
		
		animalName.setBounds(25, 50, 200, 30);
		animalSpecies.setBounds(25, 125, 200, 30);
		animalAge.setBounds(25, 200, 200, 30);
		jps.add(animalName);
		jps.add(animalSpecies);
		jps.add(animalAge);
		
		personName.setBounds(375, 50, 200, 30);
		whichAnimal.setBounds(375, 125, 200, 30);
		personAddress.setBounds(375, 200, 200, 30);
		jps.add(personName);
		jps.add(whichAnimal);
		jps.add(personAddress);
		
	}
}
