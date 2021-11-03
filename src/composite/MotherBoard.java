package composite;

public class MotherBoard implements Hardware {
    private double price;
    private String name;

    public MotherBoard () {
        this.price = 77.30;
        this.name = "motherboard";
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
