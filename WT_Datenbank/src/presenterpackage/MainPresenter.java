package presenterpackage;

import modelpackage.MainModel;
import utils.Mitglied;
import viewpackage.MainFrame;
import viewpackage.NeuesMitgliedFrame;

public class MainPresenter {
	NeuesMitgliedFrame nmf;
	MainModel mm;
	MainFrame mf;
	public void startProgram() {
//		mm = new MainModel(this);
		mf = new MainFrame(this);
	}
	
	public void neuesMitglied() {
		nmf = new NeuesMitgliedFrame(this);
		
	}
	
	public void mtglAnlegen(Mitglied mg) {
		nmf.dispose();
	}
	
	
}
