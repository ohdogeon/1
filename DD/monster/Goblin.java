package DD.monster;

public class Goblin extends Monster {
    public Goblin() {
        super("Goblin", 10, 10);
    }

    @Override
    public void printIntro() {
        System.out.println(getMonsterName() + " says: 'You won't get past me!' Health: " + getHp());
    }
}
