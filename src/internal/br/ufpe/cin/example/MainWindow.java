package internal.br.ufpe.cin.example;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class MainWindow extends JFrame{
	private static final long serialVersionUID = -1546817877885730835L;
	String text = new String();
	private JButton e1,e2, e3;

	public MainWindow() {
		super("Main Window");
		
		setLayout( new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e1 = new JButton("e1");
		e2 = new JButton("e2");
		e3 = new JButton("e3");

		e1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				e1();				
			}
		});

		e2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				e2();				
			}
		});

		e3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				e3();				
			}
		});

		add(e1);
		add(e2);
		add(e3);
		
		this.setSize(250,80);
		this.setVisible(true);
	}
	
	public void setSize(int width, int height){  
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

	// handler for event e1
	void e1(){
		text = "Hello World";
	}

	// handler for event e2
	void e2(){
		text = null;
	}

	// handler for event e3
	void e3(){
		new Dialog().setVisible(true);
	}	

	class Dialog extends JDialog{
		private static final long serialVersionUID = 2065136363065416938L;
		JButton e4;
		
		public Dialog() {
			this.setTitle("Dialog");
			this.setLayout( new FlowLayout() );
			
			e4 = new JButton("e4");
			
			e4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					e4();				
				}
			});

			add(e4);
			this.setSize(150,80);
		}
		
		// handler for event e4
		void e4(){
			text = text.trim();
			Dialog.this.setVisible(false);
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
	}

	public static void main(String[] args) {
		new MainWindow();
	}

}
