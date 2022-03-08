package gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class PeopleList {
JPanelShelter jps;
	
	public void addListPeople(JPanelShelter panel) {
		jps = panel;
		DefaultListModel<String> l1 = new DefaultListModel<>();
		JList<String> people = new JList<String>(l1);
		JScrollPane scroll = new JScrollPane(people);
		scroll.setBounds(375, 325, 300, 300);
		jps.add(scroll);
	}
}
