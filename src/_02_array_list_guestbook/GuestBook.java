package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements InputMethodListener, ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton nameButton = new JButton("Add Name");
	JButton viewButton = new JButton("View Names");
	
	public static void main(String[] args) {
		new GuestBook().start();
	}
	ArrayList<String> list = new ArrayList<String>();
	public void start() {
	
	
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	nameButton.addActionListener(this);
	viewButton.addActionListener(this);
	
	panel.add(nameButton);
	panel.add(viewButton);
	frame.add(panel);
		
		frame.pack();
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed.equals(nameButton)){
			String inputtedName = JOptionPane.showInputDialog("enter a name");
			list.add(inputtedName);
		}
		if(buttonPressed.equals(viewButton)) {
		//list.size();
		for(int i =0; i<list.size(); i++) {
			System.out.println("Guest #" + (i+1) + " " + list.get(i));
		}
		}
	}
	@Override
	public void caretPositionChanged(InputMethodEvent event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void inputMethodTextChanged(InputMethodEvent event) {
		// TODO Auto-generated method stub
		
	}

	
	
}
