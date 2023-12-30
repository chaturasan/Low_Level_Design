package models;

public class Ink {
    private String color;
    private InkType inkType;

    public Ink(String color, InkType inkType) {
        this.color = color;
        this.inkType = inkType;
    }

    public String getColor() {
        return color;
    }

    public InkType getInkType() {
        return inkType;
    }
}
