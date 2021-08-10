import java.awt.*;
import java.util.*;

class Stage {
    Grid grid;
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>(); //Array containing the basic grid that needs to be printed
    ArrayList<Actor> actors = new ArrayList<Actor>(); //Array of all the actors

    public Stage() {
        
        for (int i = 0; i < 20; i++) { //Generate the basic grid array
            ArrayList<Cell> cellList = new ArrayList<Cell>();
            cells.add(cellList);
            for (int j = 0; j < 20; j++) {
                cells.get(i).add(new Cell(10 + 35 * i, 10 + 35 * j));
            }
        }

        actors.add(new Car(cells.get(3).get(2))); //Manually add all the actors
        actors.add(new Boat(cells.get(3).get(4)));
        actors.add(new Train(cells.get(5).get(6)));

        grid = new Grid(cells); //Initialise the grid with the generated cells array
        
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos); //Paint the basic grid

        for(int i =0; i < actors.size(); i++) { //Paint all the actors in the grid
            
            actors.get(i).paint(g); 
        }
    }

}