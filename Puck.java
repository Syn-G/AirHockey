

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * Write a description of class Puck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puck extends Sprite implements KeyListener
{
    private boolean up = false;
    private boolean down = false;
    private boolean right =false;
    private boolean left = false;
    public Puck(int x,int y, String fpath){
        super();
        changeImage(fpath);
        setSize(x, y);
        addKeyListener(this);
    }

    public void  move(){
        int b = dx;
        int a = dy;

        /**if((x<=0)||(this.collides(Boundaries))){
        dx*=-1;

        }
        if((y<=0)||(this.collides(Boundaries)))
        {
        dy*=-1;
        }
         */
        this.setLocation(b,a);
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e){
        switch( e.getKeyCode()){

            case(KeyEvent.VK_UP):
            if(!up){
                up = true;
                dy += 10;
            }
            case(KeyEvent.VK_DOWN):
            if(!down){
                down = true;
                dy -= 10;
                System.out.println("This is working");

            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       switch( e.getKeyCode()){

            case(KeyEvent.VK_UP):
            if(!up){
                up = false;
                dy += 0;
            }
            case(KeyEvent.VK_DOWN):
            if(down){
                down = false;
                dy -= 0;
                System.out.println("This is also working");
            }

        }
    }

}
