

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

public class Card extends JComponent implements MouseListener{
    protected int value;
    protected boolean flipped, matched;
    protected String question;
    protected JLabel gWin;
    protected ImagePanel back;
    protected JTextArea Inquiry;
    public Card(int x, int y, int w, int h, String q){
        this.setBounds(x,y,w,h);
        question = q;
        matched=false;

        back = new ImagePanel(0,0,w,h,"back.png");
        this.add(back);

        Inquiry = new JTextArea(q) ;
        Inquiry.setVisible(false);
        Inquiry.setLineWrap(true);
        Inquiry.setBounds(0,0,w,h);
        this.add(Inquiry,0);

        addMouseListener(this);
    }

    /**
     * Returns Value that can be used to compare question & answer combos
     *
     * @return
     */
    public int getValue(){
        return  value;
    }

    /**
     * Return a boolean that states whether card is flipped
     *
     */
    public boolean isFlipped(){
        return flipped;
    }

    /**
    *Flips card
     */

    public void getFlipped(){
        this.flipped = !this.flipped;
    }

    /**
    * Allows change of Value
     */
    public int setValue(int s){
        value = s;
        return value;
    }

    /**
     * Returns the String in the JTextArea
     */
    public String getQuestion(){
        return question;
    }

    /**
     * allows for the changed value of match
     */
    public void setMatched(boolean b)
    {
        matched=b;
    }

    /**
     * returns matched
     */
    public boolean getMatched()
    {
        return matched;
    }

    /**
     * Allows the text in the JTextArea to be changed
     */
    public void setQuestion(String q){
        question = q;
    }

    /**
     * Flips all cards that are flipped up and not matched back over
     *
     */
    public void reset(ArrayList <Card> whatever) {
        for (Card c : whatever) {
            if ((c.flipped)&&(!matched)) {
                back.setVisible(true);
                Inquiry.setVisible(false);
                c.flipped = false;
            }
        }
    }

    /**
     *Flips all cards flipped back over, resets all cards to not flipped
     *
     */
    public void resetAll(ArrayList<Card> whatever){
        for(int i = 0; i<whatever.size(); i++){
            Inquiry.setVisible(false);
            back.setVisible(true);
        }
        /**arbitrary array list name[i].flipped = false;
         *
         */
    }

    /**
     * What happens when you click the JComponent/flips the card when clicked
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.back.isVisible()) {
            back.setVisible(false);
            Inquiry.setVisible(true);
            this.getFlipped();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

