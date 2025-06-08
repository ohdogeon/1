package DD.monster;

import DD.GameObject;
import DD.hero.Hero;

public abstract class Monster extends GameObject {
    protected String name;
    protected int hp;
    protected int attack;

    public Monster(String name, int hp, int attack) {
        super(name);
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getMonsterName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack(){
        return attack;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public void monsterAttack(Hero hero, Monster monster) {
        hero.takeDamage(monster.getAttack());
        System.out.println(monster.getMonsterName() + " attacks " + hero.getJob() + " " + hero.getName() + " for " + monster.getAttack() + " damage!");
    }

    public abstract void printIntro();
}
