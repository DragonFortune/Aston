package homework2.hero;

import homework2.Enemy.Enemy;

public abstract class Hero {

    private String name;
    public int health;
    public boolean isAlive;

    public Hero(String name){
        this.name = name;
        this.health = 100;
        this.isAlive = true;
    }

    public String getName(){
        return name;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
