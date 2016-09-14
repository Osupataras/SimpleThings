package mouse;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListernerEngine implements MouseListener,MouseMotionListener,Constans {


    NewMouseListener mouse;
    public int coordinate_x=coordinate_x_start;
    public int coordinate_y=coordinate_y_start;

    MouseListernerEngine(NewMouseListener listener){
        mouse=listener;
    }
    public void eat(){
        if (mouse.point.x>mouse.apple.x-pointsizex && mouse.point.x<mouse.apple.x+5 && mouse.point.y>mouse.apple.y-pointsizey && mouse.point.y<mouse.apple.y+5){
            pointsizex+=5;
            pointsizey+=5;
        }
        else{}
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
        mouse.repaint();

    }
}
