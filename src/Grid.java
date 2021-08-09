import java.awt.*;
import java.util.*;

class Grid {
    // fields
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();

    // constructor
    public Grid(ArrayList<ArrayList<Cell>> newCellList) {
        this.cells = newCellList;
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