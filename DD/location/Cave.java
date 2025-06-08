package DD.location;

import DD.GameManager;
import DD.hero.Hero;
import DD.item.Bread;
import DD.item.Item;
import DD.item.Potion;
import DD.item.Sword;
import DD.monster.*;
import DD.Battle;
import DD.Inventory;

public class Cave extends Location {
    public Cave() {
        super("Cave","[Cave] Water continues to drip from above the cave. Bread and potions should be beyond.\nBut to get there, I have to meet an orc. And then the dragon will be waiting for me.");
    }

    @Override
    public void enterLogic(Hero hero, Inventory inventory) {
        enter();

        Battle battle = Battle.getBattle();

        battle.startBattle(hero, new Orc());
        battle.startBattle(hero, new Dragon());

        foundItem(hero,inventory,new Bread());
        foundItem(hero,inventory,new Potion());
    }
}
