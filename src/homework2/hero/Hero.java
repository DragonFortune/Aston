package homework2.hero;

import homework2.Enemy.Enemy;

public class Hero {

    private String name;

    public Hero(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void attackEnemy(Enemy enemy){
        System.out.println("Hero " + getName() + " is attacking!");
    };
}
