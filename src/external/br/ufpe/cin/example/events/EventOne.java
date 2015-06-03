package external.br.ufpe.cin.example.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import external.br.ufpe.cin.example.MainWindow;

public class EventOne implements ActionListener{
	private MainWindow main;
	
	public EventOne(MainWindow m) {
		this.main = m;
	}
	
	public void actionPerformed(ActionEvent arg0) {
			this.main.text = "Hello World";
	}

}
