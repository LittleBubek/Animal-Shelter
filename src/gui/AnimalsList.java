package gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class AnimalsList {
	JPanelShelter jps;
	static DefaultListModel<String> l1 = new DefaultListModel<>();
	JList<String> animals = new JList<String>(l1);
	public void addListAnimals(JPanelShelter panel) {
		jps = panel;

		JScrollPane scroll = new JScrollPane(animals);
		scroll.setBounds(25, 325, 300, 300);
		jps.add(scroll);
	}
}
