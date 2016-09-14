package SimpleGame;


import mouse.MouseListernerEngine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Game extends JPanel implements Constans {

    JLabel label;
    public Point point=new Point(10,10);
    Random random;
    public Point apple =new Point(50,50);
    public int pointsizex=10;
    public int pointsizey=10;

    Dimension preferredSize= new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT);
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    void addPaneltoFrame(Container container) {
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        container.add(this);

        label = new JLabel("Click to see coordinates");
        container.add(label);
    }

    Game() {
        MouseListernerEngine mouseengine=new mouse.MouseListernerEngine(this);
        addMouseListener(mouseengine);
        addMouseMotionListener(mouseengine);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        g.setColor(Color.RED);
        g.fillRect(apple.x, apple.y,5,5);

        g.setColor(color);
        if (point != null) {
            label.setText("Coordinates (x,y): " + point.x +
                    ", " + point.y);
            g.fillRect(point.x, point.y, pointsizex, pointsizey);
        }

    }

    public static void main(String[] args) {
        JFrame f = new JFrame("SimpleThingsMouse");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Game mouse = new Game();
        mouse.addPaneltoFrame(f.getContentPane());
        f.pack();
        f.setVisible(true);
    }

}
