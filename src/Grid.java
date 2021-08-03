import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Grid {
    int gridLength, gridHeight, margin;
    ArrayList<ArrayList<Cell>> cellArray = new ArrayList<ArrayList<Cell>>();

    // constructors
    public Grid(int length, int height, int margin, int cellWidth, int cellHeight) {
        this.gridLength = length;
        this.gridHeight = height;
        this.margin = margin;

        for(int i = 0 ; i < gridLength; i++){
            ArrayList<Cell> currArray = new ArrayList<Cell>();
            for(int j =0; j < gridHeight; j++){
                currArray.add(new Cell(cellWidth, cellHeight, margin+(cellWidth*i), margin+(cellHeight * j)));
            }
            cellArray.add(currArray);
        }
    }

    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
        }

        public void paint(Graphics g) {
            for(int i =0; i < cellArray.size(); i++) {
                for(int j=0; j < cellArray.get(i).size(); j++) {
                    Cell currentCell = cellArray.get(i).get(j);
                    currentCell.new Canvas().paint(g);
                }
            }
        }
    }

    //methods
    public void paint() {

    }
}