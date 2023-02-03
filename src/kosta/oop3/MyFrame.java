package kosta.oop3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements ActionListener,WindowListener {
	public MyFrame() {
		Button b = new Button("Button");
		add(b);
		b.addActionListener(this);
		addWindowListener(this);
		
		setSize(300, 200);
		setLocation(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();
		String label = b.getLabel();
		System.out.println(label + "선택함");
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
