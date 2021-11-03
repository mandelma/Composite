package composite;

public class Case implements Hardware {
    private double price;
    private String name;

    public Case () {
        this.price = 20;
        this.name = "case";
    }
    @Override
    public double getPrice() {
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
