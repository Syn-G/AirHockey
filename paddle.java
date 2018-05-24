


public class Paddle extends Sprite
{
    private int deltaX,deltaY;
    
    public Paddle(int x, int y, int w, int h,String fpath){
           super(x,y,w,h, fpath);
           deltaX=0;
           deltaY=0;
    }

    public void move(){
        int x=this.getX();
        int y=this.getY();
        this.setLocation(x + deltaX, y + deltaY);
        
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
