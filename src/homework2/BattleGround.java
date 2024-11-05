package homework2;

import homework2.Enemy.Enemy;
import homework2.hero.Hero;
import homework2.hero.Warrior;

public class BattleGround {

    public static void main(String[] args) {
        Hero hero1 = new Warrior("Adam");
        Enemy zombie1 = new Enemy(100);
        while (hero1.isAlive){
            hero1.attackEnemy(zombie1);
            hero1.attackEnemy(zombie1);
            zombie1.attackHero(hero1);
            System.out.println(zombie1.isAlive());
            hero1.isAlive = hero1.health > 0;
        }
    }
}
