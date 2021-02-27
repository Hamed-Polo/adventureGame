import java.util.ArrayList;
import java.util.Random;

public class Character {
    private Random rand;
    //Create the ArrayList of Item objects here
    ArrayList<Item> inventory = new ArrayList<Item>(); //Creates an array list of item objects

    private int HP, MP, attack;
    private String name;

    //Create the Character constructor here
    public Character (String n) {
        inventory.add(new Item("Potion of Strength", "💪", 100, 2.50)); // the constructor for the character, this adds a new item to the inventory of the character.

        name = n;
        HP = 100;
        MP = 100;
        attack = 5;
    }
    public int countItems() {

        return inventory.size();

    }


    public void printInventory() { //printing the inventory

        for (int h = 0; h < inventory.size(); h++) { //looping through the inventory to gather the character's name, emoji, attackpower and price of item.
            System.out.println(inventory.get(h).getName());
            System.out.println(inventory.get(h).getEmoji());
            System.out.println(inventory.get(h).getattackPower());
            System.out.println(inventory.get(h).getPrice());
        }

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

    public int getMP() {
        return MP;
    }

    public void setHP(int h) {
        HP = h;
    }

    public void setMP(int m) {
        MP = m;
    }



    public void simpleAttack(Boss b){
        b.setHP(b.getHP() - attack);
        System.out.println(name + " performs Simple Attack against " + b.getName() + " for " + attack + " damage!");
    }

    public void thunderShock(Boss b) {
        b.setHP(b.getHP() / 2);
        System.out.println(name + " performs Thunder Shock against " + b.getName() + " for " + b.getHP() / 2 + " damage!");
    }
    public void rasengan(Boss b) {
        if (HP >= 10) {
            System.out.println(name + " performs Rasengan against " + b.getName() + " for " + (b.getHP() - (b.getHP() - (attack * 2))) + " damage!");
            b.setHP(b.getHP() - (attack * 2));

        }
        else {
            System.out.println(name + " performs Rasengan against " + b.getName() + " for " + (b.getHP() - (b.getHP() - (attack * 4))) + " damage!");
            b.setHP(b.getHP() - (attack * 4));
        }
    }

    public void heal(int amount) {
        System.out.println(name + " healed for " + amount + " and is now at " + (HP + amount) + " health!");
        HP += amount;
    }

    public void drinkPotion(int potionAmount) {
        if (HP <= 10) {
            potionAmount *= 2;
            System.out.println("Potion is twice as effective!");

        }
        heal(potionAmount);
    }

    public void gigaDrain(Boss b) {
        int drainAmount = b.getHP() - b.getHP()/4;
        System.out.println(name + " performs Giga Drain against " + b.getName() + " for " + (drainAmount) + " damage!");
        b.setHP(b.getHP() / 4);
        HP += drainAmount;
    }
    public void randomAttack(Boss b) {
        rand = new Random();
        int randomNum = rand.nextInt(6);
        System.out.println(name + " performs Random Attack against " + b.getName() + " for " + (randomNum) + " damage!");
        b.setHP(b.getHP() - randomNum);
    }

    public boolean isAlive() {
        if (getHP() <= 0) {
            return false;
        }
        else {
            return true;
        }
    }
}