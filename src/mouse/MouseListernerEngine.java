package mouse;


import SimpleGame.Constans;
import SimpleGame.Game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MouseListernerEngine implements MouseListener,MouseMotionListener, Constans {


    Game mouse;
    Random random=new Random();

    public MouseListernerEngine(Game listener){
        mouse=listener;
    }
    public void eat(){
        if (mouse.point.x>mouse.apple.x-mouse.pointsizex && mouse.point.x<mouse.apple.x+5
                && mouse.point.y>mouse.apple.y-mouse.pointsizey && mouse.point.y<mouse.apple.y+5){
            mouse.pointsizex+=5;
            mouse.pointsizey+=5;
            mouse.apple.x=random.nextInt(WINDOW_WIDTH);
            mouse.apple.y=random.nextInt(WINDOW_HEIGHT);
        }

    }

    public void applemove(){
        int movedirection=random.nextInt(3);

    }


    public void mouseClicked(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {

    }


    public void mouseReleased(MouseEvent e) {

    }


    public void mouseEntered(MouseEvent e) {

    }


    public void mouseExited(MouseEvent e) {

    }


    public void mouseDragged(MouseEvent e) {

    }


    public void mouseMoved(MouseEvent e) {
        int mouse_x=e.getX();
        int mouse_y=e.getY();

        if (mouse_x>mouse.point.x && mouse_y>mouse.point.y){
            mouse.point.x+=increment;
            mouse.point.y+=increment;
        }
        else if(mouse_x>mouse.point.x && mouse_y<mouse.point.y){
            mouse.point.x+=increment;
            mouse.point.y-=increment;
        }
        else if(mouse_x<mouse.point.x && mouse_y>mouse.point.y){
            mouse.point.x-=increment;
            mouse.point.y+=increment;
        }
        else if(mouse_x<mouse.point.x && mouse_y<mouse.point.y){
            mouse.point.x-=increment;
            mouse.point.y-=increment;
        }
        eat();
        mouse.repaint();

    }
}
