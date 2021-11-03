package main;

import composite.*;

public class Test {
    public static void main (String[] args) {
        // luodaan tietokoneen osat
        Hardware printer = new Printer();
        Hardware mouse = new Mouse();

        // koostekomponentit
        Hardware box = new Case();
        Hardware cdRom = new CdRom();
        Hardware cooler = new Cooler();

        // koostekomponentit
        Hardware motherboard = new MotherBoard();
        Hardware memory = new Memory();
        Hardware processor = new Processor();

        // rakennetaan tietokone osista
        Hardware c = new Computer();
        c.add(printer);
        c.add(mouse);

        c.add(box);
        c.add(cdRom);
        c.add(cooler);

        c.add(motherboard);
        c.add(memory);
        c.add(processor);

        // tulostetaan komponenttien hinnat
        c.print();
        System.out.println("----------------------------------");
        // tulostetaan komponenttien hinnat yhteensä
        System.out.println("Hinta yhteensä: " + c.getPrice());
    }
}
