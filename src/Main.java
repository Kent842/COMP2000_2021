import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid; //Grid object

        public App() {
            setPreferredSize(new Dimension(720, 720)); //Set window dimensions
            grid = new Grid(); //Create new Grid object
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition()); //Draw Grid, passes in graphics and current mouse position
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main(); //Create new window
        window.run(); //Run window
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App(); //Create new App called "canvas"
        this.setContentPane(canvas); //The window's content is going to be showin in "canvas"
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint(); //Constantly refreshes the page's frames
        }
    }
}