package fr.enssat.boulderdash.views;

import fr.enssat.boulderdash.controllers.LevelEditorKeyController;
import fr.enssat.boulderdash.models.LevelModel;
import fr.enssat.boulderdash.views.GroundView;
import fr.enssat.boulderdash.views.LevelEditorView;


/**
 * LevelEditorFieldView
 *
 * Game field view for the level editor.
 *
 * @author      Valerian Saliou <valerian@valeriansaliou.name>
 * @since       2015-06-21
 */
public class LevelEditorGroundView extends GroundView {
    /**
     * Class constructor
     *
     * @param  levelModel  Level model
     */
    public LevelEditorGroundView(LevelModel levelModel, LevelEditorView levelEditorView) {
        super(levelModel);

        this.addKeyListener(new LevelEditorKeyController(levelModel, levelEditorView));
    }
}
