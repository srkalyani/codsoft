

import java .util.Random;
import java.util.*;

class Game{
    private Random r = new Random();
    private Scanner s = new Scanner(System.in);
    private int num;
    private int userNum;
    private int counter=0;
    public void generateNumber(){
        num = r.nextInt(100);
    }
    public void generateNumber(int x){
        num = r.nextInt(x);
    }
    private void userInput(){
        System.out.println("Enter your guess : ");
        userNum = s.nextInt();
    }
    public void startGame(){
        while(num!=userNum){
            this.counter++;
            this.userInput();
            if(num>userNum){
                System.out.println("Your Guess is smaller!");
            } else if(num<userNum){
                System.out.println("Your Guess is larger!");
            } else {
                System.out.println("You Win!");
                System.out.println("You win the game in "+counter+" attempt");
                break;
            }
        }
    }
    
}
public class task1 {
    public static void main(String[] args) {
        Game nandy = new Game();
        // We can set user guess range between 0 to your choice. By Default = 100
        nandy.generateNumber(); 
        // Start Game
        nandy.startGame();
    }
}