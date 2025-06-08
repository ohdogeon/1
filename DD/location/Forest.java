package DD.location;
import DD.GameManager;
import DD.hero.Hero;
import DD.Inventory;
import DD.item.*;

public class Forest extends Location {
    public Forest() {
        super("Forest","[Forest] The sunlight in this forest is bright and warm. But wait. I think there's something valuable over there.");
    }

    @Override
    public void enterLogic(Hero hero, Inventory inventory) {
        enter();
        foundItem(hero,inventory,new Sword());
        foundItem(hero,inventory,new Shield());
    }
}
