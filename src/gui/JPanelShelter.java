package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import engine.DataBaseConnection;

public class JPanelShelter extends JPanel {
	DataBaseConnection connection = new DataBaseConnection();
	public JPanelShelter(AnimalsList animalsList, PeopleList peopleList, Buttons button, TextFields textFields, Labels labels) {
		setLayout(null);
		labels.addLabels(this);
		textFields.addTextFields(this);
		button.addButtons(this);
		animalsList.addListAnimals(this);
		peopleList.addListPeople(this);
		
		button.addAnimal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int age = Integer.parseInt(textFields.animalAge.getText());
				String addedAnimal = "INSERT INTO Animals VALUES (DEFAULT, '"+textFields.animalName.getText()+"', '"
			+ textFields.animalSpecies.getText()+"', "+age+");";
				connection.connectDatabase(addedAnimal);
			}
			
		});
	}
	

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(1200, 650);
	}
}
