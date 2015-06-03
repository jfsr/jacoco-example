package external.br.ufpe.cin.example;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import external.br.ufpe.cin.example.events.EventOne;
import external.br.ufpe.cin.example.events.EventThree;
import external.br.ufpe.cin.example.events.EventTwo;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = -1546817877885730835L;
	public String text = new String();
	private JButton e1,e2, e3;

	public MainWindow() {
		super("Main Window");
		setLayout( new FlowLayout() );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e1 = new JButton("e1");
		e2 = new JButton("e2");
		e3 = new JButton("e3");

		e1.addActionListener(new EventOne(this));
		e2.addActionListener(new EventTwo(this));
		e3.addActionListener(new EventThree(this));

		add(e1);
		add(e2);
		add(e3);
		
		this.setSize(250, 80);
		this.setVisible(true);
	}

	public void setSize(int width, int height)  
	{  
		super.setSize(width, height);  

		//Get the screen size  
		Toolkit toolkit = Toolkit.getDefaultToolkit();  
		Dimension screenSize = toolkit.getScreenSize();  

		//Calculate the frame location  
		int x = (screenSize.width - getWidth()) / 2;  
		int y = (screenSize.height - getHeight()) / 2;  

		//Set the new frame location  
		setLocation(x, y);     
	}  

	public static void main(String[] args) {
		new MainWindow();
	}
}
