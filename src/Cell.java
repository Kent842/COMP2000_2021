import java.awt.*;

class Cell extends Rectangle{
    // fields
    static int size = 35;
    //constructors
    public Cell(int x, int y){
        super(x,y,size,size);
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){ //Checks if the mouse is in the cell
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
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
        return "X Pos:" + super.getLocation().x + "  " + "Y Pos: " + super.getLocation().y + "  ";
    }
}