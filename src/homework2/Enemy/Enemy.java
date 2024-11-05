package homework2.Enemy;

import homework2.Mortal;
import homework2.hero.Hero;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health>=0;
    }

    public void attackHero(Hero hero) {
        System.out.println("Enemy is attacking!");
        hero.takeDamage(50);
    }
}
