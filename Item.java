public class Item { //item class
    private String emoji; //instance variable
    private String name;//instance variable
    private int attackPower;//instance variable
    private double price;//instance variable

    public Item (String n, String e, int ap, double p) {
        emoji = e;
        name = n;
        attackPower = ap;
        price = p;
    }

    public String getEmoji() { //get and set method for emoji
        return emoji;
    }

    public void setEmoji(String e) {
        emoji = e;
    }

    public String getName() { //get and set method for name
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getattackPower() { // get and set method for attack power
        return attackPower;
    }

    public void setattackPower(int ap) {
        attackPower = ap;
    }

    public double getPrice() { //get and set method for price
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }
}
