
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Component;
import java.util.TimerTask;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Game extends FileManager{
    UI ui;
    Puck One;
    private boolean up = false;
    private boolean down = false;
    
    public Game(int x, int y, int w, int h, boolean sb){
        ui = new UI(x, y, w, h, sb);
        ui.addKeyListener(new KeyListener(){
                @Override
                public void keyTyped(KeyEvent e){

                }

                @Override
                public void keyPressed(KeyEvent e){
                    int keyCode = e.getKeyCode();
                    if(keyCode == KeyEvent.VK_DOWN){
                        System.out.println("OOF");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }});

        One = new Puck(100,100,"puck.jpeg");
        One.setFocusable(true);

        //Card card = new Card(200,0,400,400,"dude");
        //sb.addPost(new Post("memes","dude","lel"));
        //sb.addPost(new Post("memes","dude","lel"));

        //sb.reDisplayPosts(sb);
        //ui.addGameObject(card);
        ui.addGameObject(One);
    }

    public UI getUI(){
        return ui;
    }

    public static void main(String[]args){
        Game gameOne = new Game(0,0,1300,700,true);
    }

    class MyTimerTask extends TimerTask{

        @Override
        public void run(){
            One.move();   

        }
    }
}
