package DD.item;

import DD.hero.Hero;

public class Sword extends Item {
    public Sword() {
        super("Sword");
    }

    @Override
    public String getItemName() {
        return "Sword";
    }

    @Override
    public void printGetItem(Hero hero) {
        System.out.println("Sword gleams with a sharp edge. Attack+4");
    }

    @Override
    public void use(Hero hero) {
        hero.setAttack(hero.getAttack() + (4 * level));
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println("Sword is now level " + level + "!");
    }
}
