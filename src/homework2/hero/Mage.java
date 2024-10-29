package homework2.hero;

import homework2.Enemy.Enemy;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + getName() + " is attacking!");
        enemy.takeDamage(20);
    }
}
