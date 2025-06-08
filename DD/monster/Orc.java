package DD.monster;

public class Orc extends Monster {
    public Orc() {
        super("Orc", 15, 30);
    }

    @Override
    public void printIntro() {
        System.out.println(getMonsterName() + " says: 'Prepare to be crushed!' Health: " + getHp());
    }
}
