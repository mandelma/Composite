package composite;

public class CdRom extends Case {
    private double price;
    private String name;

    public CdRom () {
        super();
        this.price = 100;
        this.name = "cd Rom";
    }

    @Override
    public double getPrice () {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Price of " + name + ": " + getPrice() + " euroa.");
    }
}
