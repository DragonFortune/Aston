package homework2.hero;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior " + getName() + " is attacking!");
    }
}
