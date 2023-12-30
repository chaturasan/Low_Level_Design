import models.*;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ink ballPointPenInk = new Ink("blue", InkType.BALLPOINT);
        Refill ballPointPenRefill = new Refill(ballPointPenInk, new Nib(0.5, NibType.BALLPOINT), RefillType.BALLPOINT);
        BallPointPen ballPointPen = new BallPointPen("Pin Point", "Cello", 10, ballPointPenRefill);

        Ink gellPenInk = new Ink("Red", InkType.GELL);
        Refill gellPenRefill = new Refill(gellPenInk, new Nib(0.7, NibType.GELL), RefillType.GELL);
        GellPen gellPen = new GellPen("Racer Sporty", "Reynolds", 230, gellPenRefill);

        Ink fountainPenInk = new Ink("Black", InkType.FOUNTAIN);
        FountainPen fountainPen = new FountainPen("Pilot Elite E95", "Makoba", 11900, gellPenInk, new Nib(1, NibType.FOUNTAIN));

        List<Pen> pens = new ArrayList<>();
        pens.add(ballPointPen);
        pens.add(gellPen);
        pens.add(fountainPen);

        for(Pen pen: pens) {
            pen.open();
            pen.write();
            pen.close();
        }

        List<Refillable> refillablePens = new ArrayList<>();
        refillablePens.add(ballPointPen);
        refillablePens.add(gellPen);

        for(Refillable pen: refillablePens) {
            pen.changeRefill();
        }

        List<InkChangable> inkChangablePens = new ArrayList<>();
        inkChangablePens.add(fountainPen);

        for(InkChangable pen: inkChangablePens) {
            pen.changeInk();
        }

        List<Writable> writables  = new ArrayList<>();
        writables.add(ballPointPen);
        writables.add(fountainPen);
        writables.add(gellPen);

        for(Writable writable: writables) {
            writable.write();
        }

    }
}