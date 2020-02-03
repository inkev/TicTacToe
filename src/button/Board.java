package button;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Board {
    private static final int N = 3;
    private static GameButton[][] boardButtons;
    protected static int player;
    protected static int filled;

    Board()
    {
        player = 0;
        filled = 0;
        boardButtons = new GameButton[N][N];
        JFrame t = new JFrame("Tic Tac Toe");
        t.setSize(600, 800);
        t.setLayout(new GridLayout(N, N));
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                boardButtons[i][j] = new GameButton(player);
                boardButtons[i][j].setBorder(new LineBorder(Color.black));
                boardButtons[i][j].addActionListener(new buttonListener());
                t.add(boardButtons[i][j]);
                boardButtons[i][j].setVisible(true);
            }
        }
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static int getPlayer(){
        return player;
    }

    public static void checkWin(){
        for(int i = 0; i < N; i++)
        {
            //check wins on rows
            if((boardButtons[i][0].getState() == boardButtons[i][1].getState()) && (boardButtons[i][1].getState() == boardButtons[i][2].getState())
                    && !(boardButtons[i][0].getState() == 0))
            {
                if(player%2 == 0) {
                    System.out.println("winner X");
                }
                else{
                    System.out.println("winner O");
                }
                break;
            }
            //check wins on columns
            if((boardButtons[0][i].getState() == boardButtons[1][i].getState()) && (boardButtons[1][i].getState() == boardButtons[2][i].getState())
                    && !(boardButtons[0][i].getState() == 0))
            {
                if(player%2 == 0){
                    System.out.println("winner X");
                }
                else{
                    System.out.println("winner O");
                }
                break;
            }
        }
        // checks diagonals for wins.
        if(boardButtons[0][0].getState() == boardButtons[1][1].getState() && boardButtons[1][1].getState() == boardButtons[2][2].getState()
            && !(boardButtons[0][0].getState() == 0)){
            if(player%2 == 0){
                System.out.println("winner X");
            }
            else{
                System.out.println("winner O");
            }
        }
        if(boardButtons[0][2].getState() == boardButtons[1][1].getState() && boardButtons[1][1].getState() == boardButtons[2][0].getState()
                && !(boardButtons[0][2].getState() == 0)){
            if(player%2 == 0){
                System.out.println("winner X");
            }
            else{
                System.out.println("winner O");
            }
        }
    }

}
