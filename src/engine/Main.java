package engine;


import javax.swing.JFrame;

import gui.AnimalsList;
import gui.Buttons;
import gui.JPanelShelter;
import gui.Labels;
import gui.PeopleList;
import gui.TextFields;

public class Main {

	public static void main(String[] args){
		
		AnimalsList animalsList = new AnimalsList();
		PeopleList peopleList = new PeopleList();
		TextFields textFields = new TextFields();
		Labels labels = new Labels();
		Buttons button = new Buttons();
		JPanelShelter myp = new JPanelShelter(animalsList, peopleList, button, textFields, labels);
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setTitle("Animal shelter - adoptions");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(myp);
		window.pack();

	}

}
