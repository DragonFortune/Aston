package homework2.hero;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mage " + getName() + " is attacking!");
    }
}
