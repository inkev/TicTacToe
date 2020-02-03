package button;

import javax.swing.*;

public class GameButton extends JButton{
    public int state;
    public boolean filled;
    private static int player;

    public GameButton(int player){
        state = 0;
        filled = false;
        this.player = player;
    }

    public void setState(int state){
        this.state = state;
    }
    public int getState(){
        return this.state;
    }
}
