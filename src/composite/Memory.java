package composite;

public class Memory extends MotherBoard {
    private double price;
    private String name;

    public Memory () {
        super();
        this.price = 120.0;
        this.name = "memory";
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
