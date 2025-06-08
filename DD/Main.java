package DD;

import DD.hero.Archer;
import DD.hero.Hero;
import DD.hero.Warrior;
import DD.hero.Wizard;
import DD.location.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while(true) {
            GameManager.line();
            System.out.println("Welcome to Dungeons & Dragons");
            System.out.println();
            GameManager.printChooseJob();
            int jobNum = scanner.nextInt();
            System.out.print("Enter your name: ");
            String name = scanner.next();

            Hero hero;

            switch (jobNum) {
                case 1:
                    hero = new Warrior(name);
                    break;
                case 2:
                    hero = new Archer(name);
                    break;
                case 3:
                    hero = new Wizard(name);
                    break;
                default:
                    continue;
            }
            System.out.println(hero.getJob() + " " + hero.getName() + " is ready for battle!");

            while (true) {
                GameManager.line();
                hero.printStats();
                inventory.showInventory();
                Location entrance = new Entrance();
                entrance.enterLogic(hero,inventory);
                GameManager.printChooseMap();
                int mapNum = scanner.nextInt();
                GameManager.line();
                switch (mapNum) {
                    case 1:
                        Location forest = new Forest();
                        forest.enterLogic(hero,inventory);
                        break;
                    case 2:
                        Location mountain = new Mountain();
                        mountain.enterLogic(hero,inventory);
                        break;
                    case 3:
                        Location cave = new Cave();
                        cave.enterLogic(hero,inventory);
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
    }
}
