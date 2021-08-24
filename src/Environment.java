
import java.awt.*;

abstract class Environment extends Rectangle{
    Color color; //The color which the cell is going to be painted
    int heightAboveSeaLevel;
    final int totalRange = 7000;

    void paint(Graphics g, Point mousePos) { //Allows each actor to paint itself in the specified cell
        g.setColor(determineShade(heightAboveSeaLevel, this.color));
        
        g.fillRect(super.x, super.y, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(super.x, super.y, 35, 35);
    };

    public Environment(Cell c, Color cellColor, int height) {
        super(c.x, c.y, 35 ,35);
        this.color = cellColor;
        this.heightAboveSeaLevel = height;
    }

    private Color determineShade(int height, Color c) {
        if(height >= 6500 - (totalRange/3) && height <= 6500) { // >= 4167 and <= max height
            return c;
        }
        if(height < 6500 - (totalRange/3) && height >= 6500 - (totalRange/3) * 2) { //< 4167 and >= 2334
            return color.brighter();
        }

        if(height < 6500 - (totalRange/3) * 2) {
            return color.darker().darker();
        }
 
        return c;
    }

    @Override
    public boolean contains(Point p) {
        if(p != null) {
            return super.contains(p);
        } else {
            return false;
        }
    }
}
