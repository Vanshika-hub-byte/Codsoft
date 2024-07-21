import java.util.Scanner;
import java.util.Random;

class Game{

    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getnoOfGuesses(){
        return noOfGuesses;
    }

    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }

    Game(){

        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

    void takeUserInput(){

        System.out.println("Guess the number");

        try (Scanner sc = new Scanner(System.in)) {
            inputNumber = sc.nextInt();
        }
    }

    boolean isCorrectNumber(){
        noOfGuesses++;

        if(inputNumber==number){
            System.out.format("yes you guessed it right,it was %d you gussed it in %d attempts",number,noOfGuesses);
            return true;
        }

        else if (inputNumber<number){
            System.out.println("too low...");
        }

        else if (inputNumber>number){
            System.out.println("too high....");
        }

        return false;

    }
}

    public class GuessTheNum {
    public static void main(String[] args) {

    Game g = new Game();
    boolean b = false;
    while (!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
    }
  }    
}