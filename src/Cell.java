import java.awt.*;

class Cell extends Rectangle{
    // fields
    static int size = 35;
    int heightAboveSea;
    Color cellColor;
    //constructors
    public Cell(int x, int y, int heightAbove, Color c){
        super(x,y,size,size);
        this.heightAboveSea = heightAbove; //Stores the height above sea level for each cell.
        this.cellColor = c; //Stores the color of each cell
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){ //Checks if the mouse is in the cell
            g.setColor(Color.GRAY);
        } else {
            g.setColor(this.cellColor);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    public boolean contains(Point p){ //Returns true or false based on if the mouse is in the cell
        if(p != null) {
            return(super.contains(p));
        } else {
            return false;
        }
    }

    public String toString() {
        return "X Pos:" + super.getLocation().x + "  " + "Y Pos: " + super.getLocation().y + "  " + "Sea Level: " + this.heightAboveSea;
    }
}