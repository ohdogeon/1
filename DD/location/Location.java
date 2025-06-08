package DD.location;

import DD.GameObject;
import DD.Inventory;
import DD.hero.Hero;
import DD.item.Item;

public abstract class Location extends GameObject {
    private final String message;

    public Location(String name, String message) {
        super(name);
        this.message = message;
    }

    public void enter() {
        System.out.println(message);
    }

    public abstract void enterLogic(Hero hero, Inventory inventory);

    public void foundItem(Hero hero, Inventory inventory, Item item) {
        if (item.isConsumable()) {
            item.printGetItem(hero);
            item.use(hero);
            System.out.println(hero.getJob() + " " + hero.getName() + " found a " + item.getItemName() + "!");
        }
        else {
            inventory.addItem(item, hero);
            item.use(hero);
            System.out.println(hero.getJob() + " " + hero.getName() + " found a " + item.getItemName() + "!");
        }
    }
}

