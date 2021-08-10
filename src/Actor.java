
import java.awt.*;

abstract class Actor {
    Cell cellLocation; //Stores the cell which is being colored
    Color color; //The color which the cell is going to be painted

    void paint(Graphics g) { //Allows each actor to paint itself in the specified cell
        g.setColor(color);
        g.fillRect(cellLocation.x, cellLocation.y, 35, 35);
        g.drawRect(cellLocation.x, cellLocation.y, 35, 35);
    };

    public Actor(Cell c, Color cellColor) {
        this.cellLocation = c;
        this.color = cellColor;
    }
}
