import java.awt.*;
import java.util.*;

class Stage {
    Grid grid;
    ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>(); //Array containing the basic grid that needs to be printed
    ArrayList<Actor> actors = new ArrayList<Actor>(); //Array of all the actors

    public Stage() {
        int heightStart = -500; //The start height of the cells
        int colorControl = 252; //Variable used to control the shade of blue in each cell.
        
        for (int i = 0; i < 20; i++) { //Generate the basic grid array
            ArrayList<Cell> cellList = new ArrayList<Cell>();
            cells.add(cellList);
            for (int j = 0; j < 20; j++) {
                cells.get(i).add(new Cell(10 + 35 * i, 10 + 35 * j, heightStart, new Color(20, colorControl, 255)));
                colorControl -= 12;
            }
            heightStart += 350;
            colorControl = 252; //Cells get brighter as you they go up, done by adding more GREEN into the color
        }

        for(int i =0; i < 3; i++) { //Generate actors at random spots on the Grid
            int random = (int)(Math.random() * 12) + 1;
            int randRow = (int)(Math.random() * 20);
            int randColumn = (int)(Math.random() * 20);
            if(random >= 1 && random <=4) {
                actors.add(new Car(cells.get(randRow).get(randColumn)));
            }

            if(random >=5 && random <= 8) {
                actors.add(new Boat(cells.get(randRow).get(randColumn)));
            }

            if(random >= 9 && random <= 12) {
                actors.add(new Train(cells.get(randRow).get(randColumn)));
            }
        }

        grid = new Grid(cells); //Initialise the grid with the generated cells array
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos); //Paint the basic grid

        // for(int i =0; i < actors.size(); i++) { //Paint all the actors in the grid
        //     actors.get(i).paint(g); 
        // }
    }

}