


/**
 * Write a description of class Puck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puck extends Sprite 
{
    
    public Puck(int x,int y,int w,int h, String fpath){
        super(x,y,w,h,fpath);
        changeImage(fpath);
        setSize(x, y);
        
    }

    public void  move(){
        
    }

    

}
