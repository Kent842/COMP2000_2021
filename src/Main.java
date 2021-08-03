import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    public class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g) {
            Grid newGrid = new Grid(20, 20, 10, 35, 35);
            newGrid.new Canvas().paint(g);
        }

    }

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane((canvas));
        this.pack();
        this.setVisible(true);
    }
}
