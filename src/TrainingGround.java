import homework2.hero.Archer;
import homework2.hero.Mage;
import homework2.hero.Warrior;

public class TrainingGround {
    public static void main(String[] args) {

        Warrior warrior1 = (Warrior) new Warrior("Daniil");
        warrior1.attackEnemy();

        Mage mage1 = (Mage) new Mage("Kristina");
        mage1.attackEnemy();

        Archer archer1 = (Archer) new Archer("Kate");
        archer1.attackEnemy();
    }
}