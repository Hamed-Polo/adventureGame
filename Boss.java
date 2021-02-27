import java.util.Random;

public class Boss {
    private int HP, MP, attack;
    private String name;

    public Boss() {
        name = "Default Boss Name";
        HP = 50;
        MP = 50;
        attack = 5;
        System.out.println("Boss " + name + " appeared!");
    }

    public Boss(String n) {
        name = n;
        HP = 50;
        MP = 50;
        attack = 5;
        System.out.println("Boss " + name + " appeared!");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + HP + "    MP: " + MP);
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int h) {
        HP = h;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int m) {
        MP = m;
    }

    public void simpleAttack(Character c) {
        c.setHP(c.getHP() - attack);
        System.out.println(name + " performs Simple Attack against " + c.getName() + " for " + attack + " damage!");
    }

    public void randomAttack(Character c) {
        Random rand = new Random();
        int randomNum = rand.nextInt(6);
        System.out.println(name + " performs Random Attack against " + c.getName() + " for " + (randomNum) + " damage!");
        c.setHP(c.getHP() - randomNum);
    }

    public boolean isAlive() {
        if (getHP() <= 0) {
            return false;
        } else {
            return true;
        }
    }
}