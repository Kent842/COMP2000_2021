
import java.awt.*;

class Boat extends Actor {
    
    void paint(Graphics g) {
        super.paint(g);
    }

    public Boat(Cell c) {
        super(c, Color.ORANGE);
    }

    public String toString() {
        return super.cellLocation.toString();
    }
}