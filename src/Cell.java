import javax.swing.*;
import java.awt.*;

public class Cell {
    int cellWidth, cellHeight,x , y;

    //constructors
    Cell(int width, int height, int x, int y){
        this.cellWidth = width;
        this.cellHeight = height;
        this.x = x;
        this.y = y;
    }

    public class Canvas extends JPanel {
        public void paint(Graphics g) {
            g.setColor(Color.BLACK);
            g.drawRect(x, y, cellWidth, cellHeight);
        }

    }

    //methods
    public String toString() {
        return cellWidth + ", " + cellHeight + ", " + x + ", " + y;
    }
}

