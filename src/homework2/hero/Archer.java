package homework2.hero;

import homework2.Enemy.Enemy;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + getName() + " is attacking!");
        enemy.takeDamage(22);
    }

}
