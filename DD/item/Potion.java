package DD.item;
import DD.hero.Hero;

public class Potion extends Item {

    public Potion() {
        super("Potion");
    }

    @Override
    public String getItemName() {
        return "Potion";
    }

    @Override
    public void printGetItem(Hero hero) {
        System.out.println("Potion sparkles with magical energy. Mana + 15");
    }

    @Override
    public void use(Hero hero) {
        if(hero.getMp() + 15 < hero.getMaxMp()) {
            hero.setMp(hero.getMp() + 15);
        }
        else if(hero.getMp() + 15 > hero.getMaxMp()) {
            hero.setMp(hero.getMaxMp());
        }
    }

    @Override
    public boolean isConsumable() {
        return true;
    }
}
