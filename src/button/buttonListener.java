package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class buttonListener implements ActionListener {
    GameButton buttonClicked;

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonClicked = (GameButton) e.getSource();
        if(Board.getPlayer()%2 == 0){
            buttonClicked.setState(1);
            Board.filled++;
            buttonClicked.setText("X");
        }
        else{
            buttonClicked.setState(2);
            Board.filled++;
            buttonClicked.setText("O");
        }
        Board.checkWin();
        Board.player++;


    }
}
