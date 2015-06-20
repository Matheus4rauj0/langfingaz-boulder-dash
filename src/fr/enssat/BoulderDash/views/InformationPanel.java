package fr.enssat.BoulderDash.views;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import fr.enssat.BoulderDash.models.LevelModel;

public class InformationPanel extends JPanel implements Observer{
	private LevelModel levelModel;
	private JTextArea text;
	
	public InformationPanel(LevelModel levelModel) {
		this.levelModel = levelModel;
		this.text = new JTextArea();
		this.levelModel.getGameInformationsModel().addObserver(this);
		this.text.setText("Score : " + levelModel.getGameInformationsModel().getScore() + 
				"\nRemaining diamonds : " + levelModel.getGameInformationsModel().getRemainingsDiamonds());
		this.add(this.text);
	}
<<<<<<< HEAD

	@Override
	public void update(Observable o, Object arg) {
		this.text.setText("Score : " + this.levelModel.getGameInformationsModel().getScore() + 
				"\nRemaining diamonds : " + this.levelModel.getGameInformationsModel().getRemainingsDiamonds());
=======
	
	public void updateText() {
		this.text.setText("Score : " + this.levelModel.getScore() + "\nRemaining diamonds : " + this.levelModel.getRemainingDiamondsNumber());
		//FIXME
>>>>>>> d18ed65ed4d08b4242309c0e82baa89fa78372fc
	}
}
