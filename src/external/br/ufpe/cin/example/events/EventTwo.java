package external.br.ufpe.cin.example.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import external.br.ufpe.cin.example.MainWindow;

public class EventTwo implements ActionListener{
	private MainWindow main;
	
	public EventTwo(MainWindow m) {
		this.main = m;
	}
	
	public void actionPerformed(ActionEvent arg0) {
			this.main.text = null;
	}

}