import java.awt.*;
import java.util.*;

class Stage {
  Grid grid;
  ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>(); // Array containing the basic grid that needs
                                                                       // to be printed
  ArrayList<ArrayList<Environment>> environment = new ArrayList<ArrayList<Environment>>(); // Array of all the actors

  public Stage() {

    for (int i = 0; i < 20; i++) { // Generate the basic grid array
      ArrayList<Cell> cellList = new ArrayList<Cell>();
      cells.add(cellList);
      for (int j = 0; j < 20; j++) {
        cells.get(i).add(new Cell(10 + 35 * i, 10 + 35 * j));
      }
    }

    for (int i = 0; i < cells.size(); i++) { // Generate the list of environment blocks
      ArrayList<Environment> envList = new ArrayList<Environment>();
      environment.add(envList);
      for (int j = 0; j < cells.size(); j++) {
        int cellGenerator = (int) (Math.random() * 100) + 1;
        environment.get(i).add(generateCell(cellGenerator, cells.get(i).get(j)));
      }
    }

    grid = new Grid(cells, environment); // Initialise the grid with the generated cells array
  }

  public void paint(Graphics g, Point mousePos) {
    grid.paint(g, mousePos); // Paint the basic grid

    Optional<Environment> underMouse = grid.cellAtPoint(mousePos);
    if (underMouse.isPresent()) {
      Environment hover = underMouse.get();

      if (hover.name == "Building") {
        g.drawString(String.valueOf(hover.name), 740, 40);
        return;
      }
      g.drawString(String.valueOf(hover.name + "  ") + String.valueOf(hover.heightAboveSeaLevel), 740, 30);
    }
  }

  private Environment generateCell(int determineCellType, Cell location) { // Returns a cell based on random number
                                                                           // passed in
    if (determineCellType >= 1 && determineCellType <= 40) {
      Grass g = new Grass(location, (int) (Math.random() * 6500) - 500);
      return g;
    }

    if (determineCellType >= 41 && determineCellType <= 65) {
      Mountain m = new Mountain(location, (int) (Math.random() * 6500) - 500);
      return m;
    }

    if (determineCellType >= 66 && determineCellType <= 85) {
      Water w = new Water(location, (int) (Math.random() * 6500) - 500);
      return w;
    }

    if (determineCellType >= 86 && determineCellType <= 95) {
      Road r = new Road(location, (int) (Math.random() * 6500) - 500);
      return r;
    }

    if (determineCellType >= 96 && determineCellType <= 100) {
      Building b = new Building(location);
      return b;
    }

    return null;
  }

}