import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NumberSystems implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton binToDec = new JButton();
	JButton binToHex = new JButton();
	JButton decToBin = new JButton();
	JButton decToHex = new JButton();
	JButton hexToBin = new JButton();
	JButton hexToDec = new JButton();	

	Binary binary = new Binary();
	Decimal decimal = new Decimal();
	Hexadecimal hexidecimal = new Hexadecimal();


	public void Menu() {

		//set up frame with panel
		frame.setVisible(true);
		frame.add(panel);

		//put buttons on panel
		panel.add(binToDec);
		panel.add(binToHex);
		panel.add(decToBin);
		panel.add(decToHex);
		panel.add(hexToBin);
		panel.add(hexToDec);

		//set button text
		binToDec.setText("Bin To Dec");
		binToHex.setText("Bin To Hex");
		decToBin.setText("Dec To Bin");
		decToHex.setText("Dec To Hex");
		hexToBin.setText("Hex To Bin");
		hexToDec.setText("Hex To Dec");


		frame.pack();

		binToDec.addActionListener(this);
		binToHex.addActionListener(this);
		decToBin.addActionListener(this);
		decToHex.addActionListener(this);
		hexToBin.addActionListener(this);
		hexToDec.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String inputString;
		int inputInteger;
		if (e.getSource() == binToDec) {			
			inputString = JOptionPane.showInputDialog("Enter Binary Number to Convert to Decimal");
			JOptionPane.showMessageDialog(null, "The Decimal is: " + Double.toString(Binary.binaryConvertToDecimal(inputString)));
		} else if (e.getSource() == binToHex) {
			inputString = JOptionPane.showInputDialog("Enter Binary Number To Convert to Hexadecimal"); 
			JOptionPane.showMessageDialog(null, "The Hexadecimal is: " + Binary.binaryConvertToHexadecimal(inputString));
		} else if (e.getSource() == decToBin) {
			inputInteger =  Integer.valueOf(JOptionPane.showInputDialog("Enter Decimal Number To Convert to Binary"));
			JOptionPane.showMessageDialog(null, "The Binary Number is: " + Decimal.decimalConvertToBinary(inputInteger));
		} else if (e.getSource() == decToHex) {		
			inputInteger =  Integer.valueOf(JOptionPane.showInputDialog("Enter Decimal Number To Convert to Hexadecimal"));
			JOptionPane.showMessageDialog(null, "The Hexadecimal is: " + Decimal.decimalConvertToHexadecimal(inputInteger));
		} else if (e.getSource() == hexToBin) {		
			inputString =  JOptionPane.showInputDialog("Enter Hexadecimal Number To Convert to Binary");
			JOptionPane.showMessageDialog(null, "The Binary Number  is: " + Hexadecimal.hexadecimalConvertToBinary(inputString));
		} else if (e.getSource() == hexToDec) {
			inputString = JOptionPane.showInputDialog("Enter Hexadecimal Number To Convert to Decimal");
			JOptionPane.showMessageDialog(null, "The Decimal is: " + Double.toString(Hexadecimal.hexadecimalConvertToDecimal(inputString)));
		}

	}





}

