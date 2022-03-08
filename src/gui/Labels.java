package gui;

import javax.swing.JLabel;

public class Labels {
	JPanelShelter jps;
	
	public void addLabels(JPanelShelter panel) {
		jps = panel;
		JLabel animalName = new JLabel("Enter animal's name:");
		JLabel animalSpecies = new JLabel("Enter animal's species:");
		JLabel animalAge = new JLabel("Enter animal's age:");
		animalName.setBounds(25, 25, 200, 30);
		animalSpecies.setBounds(25, 100, 200, 30);
		animalAge.setBounds(25, 175, 200, 30 );
		jps.add(animalName);
		jps.add(animalSpecies);
		jps.add(animalAge);
		
		JLabel personName = new JLabel("Enter person's name:");
		JLabel whichAnimal = new JLabel("Which animal the person wants to adopt:");
		JLabel personAddress = new JLabel("Enter address");
		personName.setBounds(375, 25, 200, 30);
		whichAnimal.setBounds(375, 100, 250, 30);
		personAddress.setBounds(375, 175, 200, 30 );
		jps.add(personName);
		jps.add(whichAnimal);
		jps.add(personAddress);
		
	}
}
