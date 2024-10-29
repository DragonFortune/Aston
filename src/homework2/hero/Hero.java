package homework2.hero;

public class Hero {

    private String name;

    public Hero(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void attackEnemy(){
        System.out.println("Hero " + getName() + " is attacking!");
    };
}
