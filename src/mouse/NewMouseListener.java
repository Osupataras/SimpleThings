package mouse;


import javax.swing.*;
import java.awt.*;


public class NewMouseListener extends JPanel implements Constans {

    JLabel label;
    public Point point=new Point(10,10);
    Dimension preferredSize= new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT);
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    void addPaneltoFrame(Container container) {
        container.setLayout(new BoxLayout(container,
                BoxLayout.Y_AXIS));
        container.add(this);

        label = new JLabel("Click to see coordinates");
        container.add(label);
    }

    NewMouseListener() {
        MouseListernerEngine mouseengine=new MouseListernerEngine(this);
        addMouseListener(mouseengine);
        addMouseMotionListener(mouseengine);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.setColor(color);
        if (point != null) {
            label.setText("Coordinates (x,y): " + point.x +
                    ", " + point.y);
            g.fillRect(point.x, point.y, 10, 10);
        }

    }

    public static void main(String[] args) {
        JFrame f = new JFrame("SimpleThingsMouse");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        NewMouseListener mouse = new NewMouseListener();
        mouse.addPaneltoFrame(f.getContentPane());
        f.pack();
        f.setVisible(true);
    }

}
