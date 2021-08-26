import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(1024, 720)); //Set window dimensions
            stage = new Stage(); //Create new Grid object
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main(); //Create new window
        window.run(); //Run window
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App(); //Create new App called "canvas"
        this.setContentPane(canvas); //The window's content is going to be shown in in "canvas"
        this.pack();
        this.setVisible(true);
    }

    public void run() { //Constantly refreshes the page's frames
        while (true) {
            this.repaint();
            try {
                Thread.sleep(20);
            } catch(InterruptedException e){}
        }
    }
}