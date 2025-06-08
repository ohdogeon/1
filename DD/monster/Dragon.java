package DD.monster;

public class Dragon extends Monster {
    public Dragon() {
        super("Dragon", 30, 50);
    }

    @Override
    public void printIntro() {
        System.out.println(getMonsterName() + " roars: 'Foolish mortal, you dare challenge me!' Health: " + getHp());
    }
}
