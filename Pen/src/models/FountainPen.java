package models;

public class FountainPen extends Pen implements InkChangable {
    private Ink ink;
    private Nib nib;
    public FountainPen(String name, String brandName, int price, Ink ink, Nib nib) {
        super(name, brandName, price, PenType.FOUNTAIN);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void changeInk() {
        System.out.println("changed Fountain pen ink");
    }

    @Override
    public void open() {
        System.out.println("Opening Fountain pen by rotating");
    }

    @Override
    public void close() {
        System.out.println("Closing Fountain pen by rotating");
    }

    @Override
    public void write() {
        System.out.println("Fountain pen writing");
    }
}
