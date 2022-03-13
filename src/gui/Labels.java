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
		
		JLabel adopt = new JLabel("Choose a person and an animal for adoption and click:");
		adopt.setBounds(725, 425, 350, 30);
		jps.add(adopt);
		
		JLabel update = new JLabel("Update adoption with ID:");
		update.setBounds(725, 485, 350, 30);
		jps.add(update);
		JLabel updatedName = new JLabel("Person ID");
		updatedName.setBounds(700, 540, 100, 30);
		jps.add(updatedName);
		JLabel updatedAnimal = new JLabel("Animal ID");
		updatedAnimal.setBounds(870, 540, 100, 30);
		jps.add(updatedAnimal);
		JLabel updatedSpecies = new JLabel("Species");
		updatedSpecies.setBounds(1040, 540, 100, 30);
		jps.add(updatedSpecies);
		
		JLabel delete = new JLabel("Delete adoption with ID:");
		delete.setBounds(725, 595, 350, 30);
		jps.add(delete);
		
	}
}
