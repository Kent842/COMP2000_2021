import java.awt.*;
import java.util.*;

class Grid {
    // fields
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();//Array of the initial cells being painted

    // constructor
    public Grid(ArrayList<ArrayList<Cell>> newCellList) {
        this.cells = newCellList;
    }

    // methods
    public void paint(Graphics g, Point mousePos) { //Paints all the cells onto the screen
        for (int i = 0; i < cells.size(); i++) {
            for (int j = 0; j < cells.get(i).size(); j++) {
                cells.get(i).get(j).paint(g, mousePos);
            }
        }
    }
}