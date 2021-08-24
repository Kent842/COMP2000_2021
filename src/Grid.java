import java.awt.*;
import java.awt.Point;
import java.util.*;

class Grid {
    // fields
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();// Array of the initial cells being painted
    ArrayList<ArrayList<Environment>> environment = new ArrayList<ArrayList<Environment>>(); //Array of all the environment blocks being painted

    public Grid(ArrayList<ArrayList<Cell>> newCellList, ArrayList<ArrayList<Environment>> newEnvList) {
        this.cells = newCellList;
        this.environment = newEnvList;
    }

    // methods
    public void paint(Graphics g, Point mousePos) { //Paints all the cells and environment blocks onto the screen
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                cells.get(i).get(j).paint(g, mousePos);
                environment.get(i).get(j).paint(g, mousePos);
            }
        }
    }

    public Optional<Environment> cellAtPoint(Point p) {
        for(int i=0; i < 20; i++) {
            for(int j=0; j < 20; j++) {
                if(environment.get(i).get(j).contains(p)) {
                    return Optional.of(environment.get(i).get(j));
                }
            }
        }

        return Optional.empty();
    }
}