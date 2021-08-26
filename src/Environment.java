
import java.awt.*;
abstract class Environment extends Rectangle {
  Color color; // The color which the cell is going to be painted
  String name;
  int heightAboveSeaLevel;
  final int totalRange = 7000;

  public Environment(Cell c, Color cellColor, String name, int height) {
    super(c.x, c.y, 35, 35);
    this.color = cellColor;
    this.name = name;
    this.heightAboveSeaLevel = height;
  }

  public Environment(Cell c, Color cellColor, String name) { // Constructor for Building as it has no elevation
    super(c.x, c.y, 35, 35);
    this.color = cellColor;
    this.name = name;
  }

  void paint(Graphics g, Point mousePos) { // Allows each actor to paint itself in the specified cell
    g.setColor(determineShade(heightAboveSeaLevel, this.color));

    g.fillRect(super.x, super.y, 35, 35);
    g.setColor(Color.BLACK);
    g.drawRect(super.x, super.y, 35, 35);
  };

  Color determineShade(int height, Color c) { // Method to determine the shade of each cell other than buildings
    if (this.name == "Building") {
      return c;
    }
    if (height >= 6500 - (totalRange / 3) && height <= 6500) { // >= 4167 and <= max height
      return c;
    }
    if (height < 6500 - (totalRange / 3) && height >= 6500 - (totalRange / 3) * 2) { // < 4167 and >= 2334
      return color.brighter();
    }

    if (height < 6500 - (totalRange / 3) * 2) {
      return color.darker().darker();
    }

    return c;
  }

  @Override
  public boolean contains(Point p) {
    if (p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}
