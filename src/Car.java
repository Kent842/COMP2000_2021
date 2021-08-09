import javax.swing.*;
import java.awt.*;

class Car extends Actor {
    Cell cell;
    
    void paint(Graphics g) {
        g.setColor(new Color(102, 0, 153));
        g.fillRect(cell.x, cell.y, 35, 35);
        g.drawRect(cell.x, cell.y, 35, 35);
    }
    
    public Car(Cell c) {
        this.cell = c;
    }

    public String toString() {
        return cell.toString();
    }
}