package DD.location;

import DD.hero.Hero;
import DD.item.*;
import DD.monster.*;
import DD.Battle;
import DD.Inventory;

public class Mountain extends Location {
    public Mountain() {
        super("Mountain","[Mountain] I climbed a steep mountain. There I see bread to eat and a new sword.\n" +
                "There's something moving in the forest grass. It's the goblins!");
    }

    @Override
    public void enterLogic(Hero hero, Inventory inventory) {
        enter();

        Battle battle = Battle.getBattle();

        battle.startBattle(hero, new Goblin());
        battle.startBattle(hero, new Goblin());

        foundItem(hero,inventory,new Sword());
        foundItem(hero,inventory,new Bread());
        foundItem(hero,inventory,new Potion());
    }
}
