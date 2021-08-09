import javax.swing.*;
import java.awt.*;

class Boat extends Actor {
    Cell cell;
    
    void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(cell.x, cell.y, 35, 35);
        g.drawRect(cell.x, cell.y, 35, 35);
    }

    public Boat(Cell c) {
        this.cell = c;
    }

    public String toString() {
        return cell.toString();
    }
}