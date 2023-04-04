package gamestates;

import main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class PickChar extends States implements Statemethods{
    public PickChar(Game game) {
        super(game);
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.drawString("Choose Character", 100, 100);
        g2.setColor(Color.red);
        g2.drawString("Click to continue", 100, 150);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            GameStates.state = GameStates.PICKITEM;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }
}
