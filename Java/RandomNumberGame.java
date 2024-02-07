import java.util.*;

import javax.swing.*;
import java.awt.*;

public class RandomNumberGame {
    public static void main(String[] args) {
        int num = 1 + (int) (100 * Math.random());
        Scanner sc=new Scanner(System.in);
        int t=7; //no. of trials
        int score=100;
        int guess,i;
        boolean hasWon=false;
        for(i=0;i<t;i++){
            guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Guess a Number!!"));
            if(guess==num){
                JOptionPane.showMessageDialog(null,"Congratulations! you guessed right :)<3");
                hasWon=true;
                break;
            }
            else if(guess>num && i!=t-1){
                JOptionPane.showMessageDialog(null,"Guess is too high..Guess Again..");
                score=score-10;
            }
            else if(guess<num && i!=t-1){
                JOptionPane.showMessageDialog(null,"Guess is too low..Guess Again..");
                score=score-10;
            }
        }
        if(hasWon){
            JOptionPane.showMessageDialog(null,"You won the game in "+t+" tries...");
        }
        if(i==t){
            JOptionPane.showMessageDialog(null,"You lost all attempts :( .The number was "+num+" .Play Again!");
        }
        JOptionPane.showMessageDialog(null, "Game over.");
    }
}