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
	public JTextField update = new JTextField();
	public JTextField delete = new JTextField();
	JTextField updatedPersonID = new JTextField();
	JTextField updatedAnimalID = new JTextField();
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
		
		update.setBounds(900, 485, 100, 30);
		jps.add(update);
		updatedPersonID.setBounds(760, 540, 100, 30);
		updatedAnimalID.setBounds(930, 540, 100, 30);
		jps.add(updatedPersonID);
		jps.add(updatedAnimalID);
		
		delete.setBounds(900, 595, 100, 30);
		jps.add(delete);
		
	}
}
