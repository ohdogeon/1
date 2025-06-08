package DD.hero;
import DD.monster.Monster;

public class Archer extends Hero {
    public Archer(String name) {
        super(name,"Archer", 70, 30, 10, 13);
    }

    @Override
    public void useSkill(Monster monster) {
        if (getMp() >= skillAttack) {
            setMp(getMp() - skillAttack);
            System.out.println(getJob() + " " + getName() + " shoots arrows to " + monster.getMonsterName() + " for " + skillAttack + " damage!");
        }
    }
}

