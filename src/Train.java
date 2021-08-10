
import java.awt.*;

class Train extends Actor {

    void paint(Graphics g) {
        super.paint(g);
    }

    public Train(Cell c) {
        super(c, Color.RED);
    }

    public String toString() {
        return super.cellLocation.toString();
    }
    
}