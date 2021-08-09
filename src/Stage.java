import java.awt.*;
import java.util.*;

class Stage {
    Grid grid;
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();
    ArrayList<Actor> actors = new ArrayList<Actor>();

    public Stage(Grid g) {
        
        for (int i = 0; i < 20; i++) {
            ArrayList<Cell> cellList = new ArrayList<Cell>();
            cells.add(cellList);
            for (int j = 0; j < 20; j++) {
                cells.get(i).add(new Cell(10 + 35 * i, 10 + 35 * j));
            }
        }

        actors.add(new Car(cells.get(3).get(2)));
        actors.add(new Boat(cells.get(3).get(4)));
        actors.add(new Train(cells.get(5).get(6)));

        grid = new Grid(cells);
        
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);

        for(int i =0; i < actors.size(); i++) {
            
            actors.get(i).paint(g);
        }
    }

}