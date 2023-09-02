package hust.soict.globalict.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class AWTAccumulator extends Frame {
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;

	public AWTAccumulator() {
		setLayout(new GridLayout(2, 2));
		add(new Label("Enter an Integer: "));
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		add(new Label("The Accumulated Sum is: "));
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		AWTAccumulator accumulator = new AWTAccumulator();
		accumulator.addWindowListener(new MyWindowListener());
	}

	private class TFInputListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}
	}

	static class MyWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
