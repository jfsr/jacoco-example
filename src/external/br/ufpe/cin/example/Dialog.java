package external.br.ufpe.cin.example;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Dialog  extends JDialog{
	private static final long serialVersionUID = 2065136363065416938L;
	private JButton e4;
	private MainWindow main;
	
	public Dialog(MainWindow m) {
		super(m);
		this.setTitle("Dialog");
		this.setLayout( new FlowLayout() );
		this.e4 = new JButton("e4");
		this.main = m;
		
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				e4();				
			}
		});

		add(e4);
		
		this.setSize(150,80);
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

	// handler for event e4
	void e4(){
		this.main.text = this.main.text.trim();
		System.out.println(this.main.text);
		Dialog.this.setVisible(false);
	}
}