package fr.enssat.boulderdash;

import javax.swing.*;

import fr.enssat.boulderdash.controllers.NavigationBetweenViewController;


/**
 * Game
 *
 * Spawns the game.
 *
 * @author      Valerian Saliou <valerian@valeriansaliou.name>
 * @since       2015-06-19
 */
public class Game {
    /**
     * Class constructor
     *
     * @param  args  Command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NavigationBetweenViewController();
            }
        });
    }
}
