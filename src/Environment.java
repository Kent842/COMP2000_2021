
import java.awt.*;

abstract class Environment {
    Cell cellLocation; //Stores the cell which is being colored
    Color color; //The color which the cell is going to be painted
    int heightAboveSeaLevel;
    final int totalRange = 7000;


    void paint(Graphics g) { //Allows each actor to paint itself in the specified cell
        g.setColor(determineShade(heightAboveSeaLevel, this.color));
        
        g.fillRect(cellLocation.x, cellLocation.y, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(cellLocation.x, cellLocation.y, 35, 35);
    };

    public Environment(Cell c, Color cellColor, int height) {
        this.cellLocation = c;
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
            return color.darker();
        }

        System.out.println(height + "reached");
        return c;
    }
}
