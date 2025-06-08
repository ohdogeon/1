package DD.item;

import DD.hero.Hero;

public class Shield extends Item {
    public Shield() {
        super("Shield");
    }

    @Override
    public String getItemName() {
        return "Shield";
    }

    @Override
    public void printGetItem(Hero hero) {
        System.out.println("Shield feels sturdy and reliable. MaxHealth+20");
    }

    @Override
    public void use(Hero hero) {
        hero.setMaxHp(hero.getMaxHp() + (20 * level));
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println("Shield is now level " + level + "!");
    }
}
