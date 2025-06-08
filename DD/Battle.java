package DD;

import DD.hero.Hero;
import DD.monster.Monster;

public class Battle {

    private static final Battle battle = new Battle();

    private Battle() {}

    public static Battle getBattle() {
        return battle;
    }

    public void startBattle(Hero hero, Monster monster) {
        monster.printIntro();

        String monsterName = monster.getMonsterName();

        while (hero.getHp() > 0 && monster.getHp() > 0) {
            monster.monsterAttack(hero, monster);
            hero.printStats();
            if (hero.getHp() > 0) {
                hero.heroAttack(monster, hero);
            }
        }

        if (monster.getHp() <= 0) {
            System.out.println(monsterName + " is dead.");
        } else {
            System.out.println("You are dead.");
            System.exit(0);  // 종료 전 상태 저장 등을 고려한다면 이 부분도 분리 가능
        }
    }
}
