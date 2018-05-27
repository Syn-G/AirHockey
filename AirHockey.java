import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.*;
/**
 * Write a description of class AirHockey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirHockey extends UI implements KeyListener
{
    private GoalPost gp1,gp2;
    private Puck     stone;
    private Paddle   pld1,pld2;
    private Boundaries Bd;
    private GoalPost Gp;
    private boolean up,down,wKey,sKey = false;
    public AirHockey()
    {
        super(false);
        setFocusable(true);
        addKeyListener(this);

        pld1 = new  Paddle(200,50,100,100,"PaddleOne.jpg");
        pld2 = new  Paddle(700,100,100,100,"PaddleOne.jpg");
        Bd = new Boundaries(0,0,1000,550,"hockey_rink_diagram.jpg");
        Gp = new GoalPost(1000,500,50,50,"goalpost.jpg");
        stone = new Puck(50,50,50,50,"puck.jpeg",this);
        this.add(stone,0);
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
                    stone.move();
                    if(pld1.collides(stone)){
                        stone.setDeltaX(stone.getDeltaX()*-1);
                    }
                    if(pld2.collides(stone)){
                        stone.setDeltaX(stone.getDeltaX()*-1);
                    }
                    if(Gp.collides(stone)){
                        stone.setVisible(false);   
                        stone.setDeltaX(0);
                        stone.setDeltaY(0);
                        System.out.println("You got a point.");
                    }
                    /**
                    if(Bd.collides(pld1)){
                    pld1.setDeltaY(0);
                    System.out.println("you hit the boader!");
                    }

                    if(Bd.collides(pld2)){
                    pld2.setDeltaY(0);
                    System.out.println("you hit the boader!");
                    }
                     */
                    //if(){

                    //}
                    pld1.repaint();
                    pld2.repaint();
                    stone.repaint();
                }
            },10, 1000/40);

    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();

        if(keyCode==KeyEvent.VK_W){

            pld1.up();
        }

        if(keyCode== KeyEvent.VK_S){

                
            pld1.down();
        }

        if(keyCode==KeyEvent.VK_UP){

            pld2.up();
        }

        if(keyCode == KeyEvent.VK_DOWN){

            pld2.down();
        }

        this.repaint();
    }

    public void keyReleased(KeyEvent e){

    }

    public void keyTyped(KeyEvent e){}
}
