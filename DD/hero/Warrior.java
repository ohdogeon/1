package DD.hero;
import DD.monster.Monster;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, "Warrior", 120, 0, 15, 30);
    }

    @Override
    public boolean hasSkill(){
        return false;
    }

    @Override
    public void useSkill(Monster monster) {
    }
}
