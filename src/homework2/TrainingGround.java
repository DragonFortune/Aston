package homework2;

import homework2.Enemy.Enemy;
import homework2.hero.Archer;
import homework2.hero.Mage;
import homework2.hero.Warrior;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy1 = new Enemy(100);

        Warrior warrior1 = (Warrior) new Warrior("Daniil");
        warrior1.attackEnemy(enemy1);

        Mage mage1 = (Mage) new Mage("Kristina");
        mage1.attackEnemy(enemy1);

        Archer archer1 = (Archer) new Archer("Kate");
        archer1.attackEnemy(enemy1);
    }
}