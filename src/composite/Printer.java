package composite;

public class Printer implements Hardware {
    private double price;
    private String name;

    public Printer () {
        this.price = 50.0;
        this.name = "printer";
    }

    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public void add(Hardware hardware) {

    }

    @Override
    public void print() {
        System.out.println("Price of " + name + ": " + getPrice() + " euroa.");
    }
}
