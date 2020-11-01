package cal;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class Calculator extends JFrame implements ActionListener {
	double yes = 0;
	double no = 0;
	double result = 0;
	boolean one = false;
	boolean two = false;
	boolean three = false;
	boolean four = false;
	boolean clear = false;

	private JPanel parentPanel = new JPanel(new MigLayout());
	JPanel panel2 = new JPanel(new MigLayout());
	JButton number0 = new JButton("0");
	JButton number1 = new JButton("1");
	JButton number2 = new JButton("2");
	JButton number3 = new JButton("3");
	JButton number4 = new JButton("4");
	JButton number5 = new JButton("5");
	JButton number6 = new JButton("6");
	JButton number7 = new JButton("7");
	JButton number8 = new JButton("8");
	JButton number9 = new JButton("9");
	JButton equals = new JButton("=");
	JButton add = new JButton("+");
	JButton minus = new JButton("-");
	JButton multiply = new JButton("*");
	JButton divide = new JButton("/");
	JButton remove = new JButton("<-");
	JButton CE = new JButton("CE");
	JButton C = new JButton("C");
	JButton point = new JButton(".");
	JTextField Screen = new JTextField(50);

	public Calculator() {

		parentPanel.add(panel2);
		panel2.setLayout(new MigLayout());
		Screen.setEditable(false);
		add(parentPanel);
		setTitle("Calculator");
		setSize(350, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel2.add(Screen,"span 4,wrap");
		panel2.add(remove);
		panel2.add(CE);
		panel2.add(C);
		panel2.add(add, "wrap");
		panel2.add(number7);
		panel2.add(number8);
		panel2.add(number9);
		panel2.add(divide, "wrap");
		panel2.add(number4);
		panel2.add(number5);
		panel2.add(number6);
		panel2.add(multiply, "wrap");
		panel2.add(number1);
		panel2.add(number2);
		panel2.add(number3);
		panel2.add(minus, "wrap");
		panel2.add(number0, "span ");
		panel2.add(point);
		panel2.add(equals);

		number0.addActionListener(this);
		number1.addActionListener(this);
		number2.addActionListener(this);
		number3.addActionListener(this);
		number4.addActionListener(this);
		number5.addActionListener(this);
		number6.addActionListener(this);
		number7.addActionListener(this);
		number8.addActionListener(this);
		number9.addActionListener(this);
		minus.addActionListener(this);
		add.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		point.addActionListener(this);
		equals.addActionListener(this);
		remove.addActionListener(this);
		CE.addActionListener(this);
		C.addActionListener(this);

	}

	public static void main(String[] args) {
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == number0) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("0"));
		} else if (e.getSource() == number1) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("1"));
		} else if (e.getSource() == number2) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("2"));
		} else if (e.getSource() == number3) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("3"));
		} else if (e.getSource() == number4) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("4"));
		} else if (e.getSource() == number5) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("5"));
		} else if (e.getSource() == number6) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("6"));
		} else if (e.getSource() == number7) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("7"));
		} else if (e.getSource() == number8) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("8"));
		} else if (e.getSource() == number9) {
			if (clear != false) {
				Screen.setText("");
				yes = 0;
				no = 0;
				result = 0;
				clear = false;
			}
			Screen.setText(Screen.getText().concat("9"));
		} else if (e.getSource() == point) {
			Screen.setText(Screen.getText().concat("."));
		} else if (e.getSource() == C) {
			Screen.setText("");
		} else if (e.getSource() == CE) {
			Screen.setText("");
			yes = 0;
			no = 0;
			result = 0;
		} else if (e.getSource() == add) {
			yes = Double.parseDouble(Screen.getText());
			Screen.setText("");
			one = true;
		} else if (e.getSource() == minus) {
			yes = Double.parseDouble(Screen.getText());
			Screen.setText("");
			two = true;
		} else if (e.getSource() == divide) {
			yes = Double.parseDouble(Screen.getText());
			Screen.setText("");
			three = true;
		} else if (e.getSource() == multiply) {
			yes = Double.parseDouble(Screen.getText());
			Screen.setText("");
			four = true;

		} else if (e.getSource() == equals) {
			no = Double.parseDouble(Screen.getText());
			if (one != false) {
				result = yes + no;
				Screen.setText("" + result);
				one = false;
				clear = true;
			} else if (two != false) {
				result = yes - no;
				Screen.setText("" + result);
				two = false;
				clear = true;
			} else if (three != false) {
				result = yes / no;
				Screen.setText("" + result);
				three = false;
				clear = true;
			} else if (four != false) {
				result = yes * no;
				Screen.setText("" + result);
				four = false;
				clear = true;
			}
		} else if (e.getSource() == remove) {
                String okay =Screen.getText();
                Screen.setText("");
                for(int i=0;i<okay.length()-1;i++) {
                	Screen.setText(Screen.getText()+okay.charAt(i));
                }
		}

	}
}
