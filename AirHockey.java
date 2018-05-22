import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Write a description of class AirHockey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirHockey extends UI implements KeyListener
{
    private GoalPost gp1,gp2;
    private Puck     p;
    private Paddle   pld1,pld2;
    
    public AirHockey()
    {
        super(false);
        setFocusable(true);
        addKeyListener(this);
        pld1 = new  Paddle(200,50,10,500,"PaddleOne.jpg");
        this.add(pld1);
    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_W){
            pld1.up();
        }
        if(keyCode == KeyEvent.VK_L){
            pld2.down();
        }
        /**if(keyCode == KeyEvent.VK_W){
            gp2.up();
        }
        if(keyCode == KeyEvent.VK_U){
            gp2.down();
        }*/
        this.repaint();
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    
}
