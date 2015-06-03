package external.br.ufpe.cin.example.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import external.br.ufpe.cin.example.Dialog;
import external.br.ufpe.cin.example.MainWindow;

public class EventThree implements ActionListener{
	private MainWindow main;
	
	public EventThree(MainWindow m) {
		this.main = m;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		new Dialog(main).setVisible(true);
	}

}
