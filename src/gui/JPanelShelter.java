package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import engine.DataBaseConnection;

public class JPanelShelter extends JPanel {
	DataBaseConnection connection = new DataBaseConnection();
	public static DefaultTableModel t1 = new DefaultTableModel();
	public static DefaultTableModel modelTablePeople = new DefaultTableModel();
	public JPanelShelter(Buttons button, TextFields textFields, Labels labels) {
		setLayout(null);
		labels.addLabels(this);
		textFields.addTextFields(this);
		button.addButtons(this);
		
		JTable tab = new JTable(t1);
		t1.addColumn("ID");
		t1.addColumn("Animal name");
		t1.addColumn("Species");
		t1.addColumn("Age");
		JScrollPane scroll = new JScrollPane(tab);
		scroll.setBounds(25, 325, 300, 300);
		add(scroll);
		
		JTable tabPeople = new JTable(modelTablePeople);
		modelTablePeople.addColumn("ID");
		modelTablePeople.addColumn("Name");
		modelTablePeople.addColumn("Animal");
		modelTablePeople.addColumn("Address");
		JScrollPane scrollPeople = new JScrollPane(tabPeople);
		scrollPeople.setBounds(375, 325, 300, 300);
		add(scrollPeople);

		button.addAnimal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int age = Integer.parseInt(textFields.animalAge.getText());
				String addedAnimal = "INSERT INTO Animals VALUES (DEFAULT, '"+textFields.animalName.getText()+"', '"
			+ textFields.animalSpecies.getText()+"', "+age+");";
				connection.addAnimalToDatabase(addedAnimal);
			}	
		});
		
		button.addPerson.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String addedPerson = "INSERT INTO People VALUES (DEFAULT, '"+textFields.personName.getText()+"', '"
			+ textFields.whichAnimal.getText()+"', '"+ textFields.personAddress.getText()+"');";
				connection.addPersonToDatabase(addedPerson);
			}	
		});
	}
	

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(1200, 650);
	}
}
