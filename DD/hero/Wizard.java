package DD.hero;
import DD.monster.Monster;

public class Wizard extends Hero {
    public Wizard(String name) {
        super(name,"Wizard", 40, 60, 5, 20);
    }

    @Override
    public void useSkill(Monster monster) {
        if (getMp() >= 10) {
            setMp(getMp() - 10);
            int damage = skillAttack;
            System.out.println(getJob() + " " + getName() + " casts Fireball to " + monster.getMonsterName() + " for " + damage + " damage!");
            monster.takeDamage(damage);
        } else {
            System.out.println(getJob() + " " + getName() + " does not have enough MP!");
        }
    }
}

