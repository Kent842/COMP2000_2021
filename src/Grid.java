import java.awt.*;
import java.util.*;

class Grid {
    // fields
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();

    // constructor
    public Grid() {
        for (int i = 0; i < 20; i++) {
            ArrayList<Cell> cellList = new ArrayList<Cell>();
            cells.add(cellList);
            for (int j = 0; j < 20; j++) {
                cells.get(i).add(new Cell(10 + 35 * i, 10 + 35 * j));
            }
        }
    }

    // methods
    public void paint(Graphics g, Point mousePos) {
        for (int i = 0; i < cells.size(); i++) {
            for (int j = 0; j < cells.get(i).size(); j++) {
                cells.get(i).get(j).paint(g, mousePos);
            }
        }
    }
}