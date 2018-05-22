

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
    
    public Puck(int x,int y,int w,int h, String fpath){
        super(x,y,w,h,fpath);
        deltaX = 8;
        deltaY = -9;
        
        changeImage(fpath);
        setSize(x, y);

    }

    public void  move(){

        int x = this.getX(); 
        int y = this.getY();
        if((x<=0)||(x>=1400-75))
        {
            deltaX*=-1;
        }
        if((y<=0)||(y>=1400-75))
        {   
            deltaY*=-1;
        }
        this.setLocation(x + deltaX, y + deltaY);
        repaint();
        
    }
    
}
