package DD.location;

import DD.GameManager;
import DD.hero.Hero;
import DD.Inventory;
import DD.item.Item;

public class Entrance extends Location {
    public Entrance() {
        super("Entrance","[Entrance] I am standing at an entrance. This entrance leads to three paths. A forest, a mountain, and a cave.");
    }

    @Override
    public void enterLogic(Hero hero, Inventory inventory) {
        enter();
    }
}
