package DD.hero;
import DD.GameObject;
import DD.monster.Monster;

public abstract class Hero extends GameObject {
    private final String job;
    private int maxHp;
    private int hp;
    private final int maxMp;
    private int mp;
    private int attack;
    protected final int skillAttack;

    public Hero(String name, String job, int maxHp, int maxMp, int attack, int skillAttack) {
        super(name);
        this.job = job;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxMp = maxMp;
        this.mp = maxMp;
        this.attack = attack;
        this.skillAttack = skillAttack;
    }

    public String getJob() {
        return job;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public int getAttack() {
        return attack;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public boolean hasSkill(){
        return true;
    }

    public void heroAttack(Monster monster, Hero hero) {
        monster.takeDamage(hero.getAttack());
        System.out.println(hero.getJob() + " " + hero.getName() + " attacks " + monster.getMonsterName() + " for " + hero.getAttack() + " damage!");
        if(hasSkill()){
            useSkill(monster);
        }
    }

    public void printStats() {
        System.out.println("[" + getJob() + " " + getName() + "] " + "Health: " + getHp() + "/" + getMaxHp() + " Mana " + getMp() + "/" + getMaxMp() + " Attack: " + getAttack());
    }

    public abstract void useSkill(Monster monster);
}
