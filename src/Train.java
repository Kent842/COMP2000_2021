import javax.swing.*;
import java.awt.*;

class Train extends Actor {
    Cell cell;

    void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(cell.x, cell.y, 35, 35);
        g.drawRect(cell.x, cell.y, 35, 35);
    }

    public Train(Cell c) {
        this.cell = c;
    }

    public String toString() {
        return cell.toString();
    }
    
}