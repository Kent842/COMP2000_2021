
import java.awt.*;

abstract class Actor {
    Cell cellLocation;
    Color color;

    void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(cellLocation.x, cellLocation.y, 35, 35);
        g.drawRect(cellLocation.x, cellLocation.y, 35, 35);
    };

    public Actor(Cell c, Color cellColor) {
        this.cellLocation = c;
        this.color = cellColor;
    }
}
