package homework2.hero;

import homework2.Enemy.Enemy;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + getName() + " is attacking!");
        enemy.takeDamage(15);
    }
}
