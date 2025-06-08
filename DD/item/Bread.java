package DD.item;

import DD.hero.Hero;

public class Bread extends Item {

    public Bread() {
        super("Bread");
    }

    @Override
    public String getItemName() {
        return "Bread";
    }

    @Override
    public void printGetItem(Hero hero) {
        System.out.println("Bread gives me strength! Health + 35");
    }

    @Override
    public void use(Hero hero) {
        if(hero.getHp() + 35 < hero.getMaxHp()) {
            hero.setHp(hero.getHp() + 35);
        }
        else if(hero.getHp() + 35 > hero.getMaxHp()) {
            hero.setHp(hero.getMaxHp());
        }
    }

    @Override
    public boolean isConsumable() {
        return true;
    }
}
