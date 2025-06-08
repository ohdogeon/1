package DD;

import DD.hero.Hero;
import DD.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item newItem, Hero hero) {
        boolean found = false;

        for (Item item : items) {
            if (item.getName().equals(newItem.getName())) {
                item.printGetItem(hero);
                item.levelUp();
                found = true;
                break;
            }
        }

        if (!found) {
            items.add(newItem);
            newItem.printGetItem(hero);
        }
    }

    public void showInventory() {
        System.out.print("Items: ");
        if (items.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.print(items.get(i).getDisplayName());
                if (i != items.size() - 1) {
                    System.out.print(", ");  // 마지막 아이템이 아니면 쉼표
                }
            }
            System.out.println();  // 줄바꿈
        }
    }

}
