
public class Paddle extends Sprite
{
    private int deltaX,deltaY;
    private AirHockey boarder;
    public Paddle(int x, int y, int w, int h,String fpath){
        super(x,y,w,h, fpath);
        deltaX=0;
        deltaY=0;
    }
    public void move(){
        int x=this.getX();
        int y=this.getY();
        
        
        if((y>=700-55)||(y<= -35))
        {   
            deltaY*=-1;
        }
        this.setLocation(x + deltaX, y + deltaY);
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
    public void down(){
        deltaY = 5;
        deltaX = 0;
        move();
    }
    public void up(){
        deltaY = -5;
        deltaX =0;
        move();
    }
}