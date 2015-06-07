package modelToImplement;

import fr.enssat.BoulderDash.models.DisplayableElementModel;

public class ButterflyModel extends DisplayableElementModel {
    private static String spriteName;
    private static Boolean isDestructible;
    private static boolean impactExplosive;
    private static boolean isMoving;
    private static boolean animate;
    private static int priority;

    static {
        spriteName = "field_00";
        isDestructible = false;
        isMoving=true;
        impactExplosive=true;
        animate=true;
        priority = 2;
    }

    public ButterflyModel(int x, int y) {
    	super(animate, animate, x, y, spriteName, y, animate, animate);
    }
}