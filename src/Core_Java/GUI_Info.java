package Core_Java;

import javax.swing.JOptionPane;
public class GUI_Info {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter yout age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter yout Height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall"); 
		
	}
}
