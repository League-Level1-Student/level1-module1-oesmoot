package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame fram;
	JPanel panle;
	JTextField ansewr;
	JButton butone;
	public BinaryConverter() {
		fram= new JFrame();
		panle = new JPanel();
		fram.show();
		fram.add(panle);
		fram.setDefaultCloseOperation(fram.EXIT_ON_CLOSE);
		fram.pack();
		ansewr = new JTextField(20);
		panle.add(ansewr);
		fram.pack();
		butone = new JButton();
		panle.add(butone);
		butone.addActionListener(this);
		ansewr.getText();
	}
	public static void main(String[] args) {
		BinaryConverter binry = new BinaryConverter();
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String cunvorjen = convert(ansewr.getText());
		JOptionPane.showMessageDialog(null, cunvorjen);
	}
}