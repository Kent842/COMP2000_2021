
import java.awt.*;

class Car extends Actor {
    
    void paint(Graphics g) { //Calls the paint function of the Actor super-class to allow the cell to paint itself.
        super.paint(g);
    }
    
    public Car(Cell c) {
        super(c, new Color(102,0,153));
    }

    public String toString() {
        return super.cellLocation.toString();
    }
}