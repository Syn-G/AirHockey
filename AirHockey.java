import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
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
    private Boundaries Bd;

    public AirHockey()
    {
        super(false);
        setFocusable(true);
        addKeyListener(this);
        pld1 = new  Paddle(200,50,50,50,"PaddleOne.jpg");
        pld2 = new  Paddle(700,100,100,100,"PaddleOne.jpg");
        Bd = new Boundaries(0,0,1000,700,"hockey_rink_diagram.jpg");
        this.add(pld1);
        this.add(pld2);
        this.add(Bd);
        repaint();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run(){
                    pld1.move();
                    pld2.move();
                    
                }
            },2*60*1000, 2*60*1000);
    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_W){
            pld1.up();
        }
        if(keyCode == KeyEvent.VK_L){
            pld1.down();
        }
        if(keyCode == KeyEvent.VK_UP){
            pld2.up();
        }
        if(keyCode == KeyEvent.VK_DOWN){
            pld2.down();
        }
        this.repaint();
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}

}
