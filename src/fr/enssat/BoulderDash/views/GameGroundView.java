package fr.enssat.boulderdash.views;

import javax.swing.*;

import fr.enssat.boulderdash.controllers.GameController;
import fr.enssat.boulderdash.controllers.GameKeyController;
import fr.enssat.boulderdash.models.LevelModel;
import fr.enssat.boulderdash.views.GroundView;

import java.awt.*;


/**
 * GameFieldView
 *
 * Game field view for the game itself.
 *
 * @author      Valerian Saliou <valerian@valeriansaliou.name>
 * @since       2015-06-21
 */
public class GameGroundView extends GroundView {
    private GameController gameController;

    /**
     * Class constructor
     *
     * @param  gameController  Game controller
     * @param  levelModel      Level model
     */
    public GameGroundView(GameController gameController, LevelModel levelModel) {
        super(levelModel);

        this.gameController = gameController;

        this.addKeyListener(new GameKeyController(this.levelModel, this.gameController.getAudioLoadHelper()));

        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setFocusable(true);
    }
}
