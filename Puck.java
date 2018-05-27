import java.util.Random;

/**
 * Write a description of class Puck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puck extends Sprite  
{
    private int deltaX;
    private int deltaY;
    private AirHockey boarder;

    public Puck(int x,int y,int w,int h, String fpath,AirHockey b){
        super(x,y,w,h,fpath);
        deltaX = 8;
        deltaY = -9;
        boarder = b;
        changeImage(fpath);
        
        Random gen = new Random();
        deltaX = gen.nextInt(10)+1;
        deltaY= gen.nextInt(10)+1;
    }

    public int getDeltaX(){
        return deltaX;
    }

    public void setDeltaX( int dx){
        deltaX=dx; 
    }

    public int getDeltaY(){
        return deltaX;
    }

    public void setDeltaY( int x){
        deltaX=x; 
    }

    public void  move(){

        int x = this.getX(); 
        int y = this.getY();
        if((x<=0)||(x>=boarder.getWidth()-25))
        {
            deltaX*=-1;
        }
        if((y<=0)||(y>=boarder.getHeight()-35))
        {   
            deltaY*=-1;
        }
        this.setLocation(x + deltaX, y + deltaY);
        repaint();

    }

}
