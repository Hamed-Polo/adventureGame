import java.util.Scanner;

public class adventureGame {
    public static void main(String[] args) {

        //Create your Character object by calling the Character constructor
        Character c = new Character("Black Jesus"); // calling the character constructor, creating a character.
        c.printInventory(); // calling the character's inventory.
        c.countItems(); // calling the items.

        Boss b = new Boss("Skolas");
        Scanner kb = new Scanner(System.in);
        int playerChoice;

        while (c.isAlive() && b.isAlive()) {
            c.printInfo();
            System.out.println("");
            b.printInfo();
            System.out.println("");

            System.out.println("Which attack?");
            System.out.println("1: Simple Attack");
            System.out.println("2: Rasengan");
            System.out.println("3: Giga Drain");
            System.out.println("4: Drink Potion");
            System.out.println("5: Thundershock");
            System.out.println("6: Random Attack");

            playerChoice = kb.nextInt();
            switch (playerChoice) {
                case 1: c.simpleAttack(b);
                    break;
                case 2: c.rasengan(b);
                    break;
                case 3: c.gigaDrain(b);
                    break;
                case 4: c.drinkPotion(5);
                    break;
                case 5: c.thunderShock(b);
                    break;
                case 6: c.randomAttack(b);
                    break;
                default: System.out.println("Incorrect input!");
                    break;
            }
            int rand = (int) Math.floor(1 + Math.random() * Math.floor(2));
            if (rand == 1){
                b.simpleAttack(c);
            }
            else if (rand == 2){
                b.randomAttack(c);
            }
            System.out.println("");
            System.out.println("");
        }
        if (!c.isAlive() && !b.isAlive()) {
            System.out.println("Simultaneous knockout!");
        }
        else if (!c.isAlive()) {
            System.out.println("Enemy wins!");
        }
        else if (!b.isAlive()) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Something went wrong!");
        }

        kb.close();
    }
}
