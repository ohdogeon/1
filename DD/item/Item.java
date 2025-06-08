package DD.item;

import DD.GameObject;
import DD.hero.Hero;

public abstract class Item extends GameObject {
    protected int level = 1;

    public Item(String name) {
        super(name);
    }

    public abstract String getItemName();

    public String getDisplayName() {
        return getItemName() + " (L" + level + ")";
    }

    public void printGetItem(Hero hero) {
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level++;
    }

    public abstract void use(Hero hero);

    public boolean isConsumable() {
        return false;
    }
}
