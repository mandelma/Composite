package composite;

public class Mouse implements Hardware {
    private double price;
    private String name;

    public Mouse () {
        this.price = 14.5;
        this.name = "mouse";
    }

    public double getPrice () {
        return price;
    }

    @Override
    public void add(Hardware hardware) {

    }

    @Override
    public void print() {
        System.out.println("Price of " + name + ": " + getPrice() + " euroa.");
    }
}
