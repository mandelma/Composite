package composite;

public class Cooler extends Case {
    private double price;
    private String name;

    public Cooler () {
        super();
        this.price = 15.0;
        this.name = "cooler";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Price of " + name + ": " + getPrice() + " euroa.");
    }
}
