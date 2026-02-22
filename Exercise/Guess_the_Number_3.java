import java.util.Random;
import java.util.Scanner;

class Game{
    int Rnumber;
    int Unumber;
    int NoOfGuesses;

    Game(){
        Random rand = new Random();
        this.Rnumber = rand.nextInt(100);
    }

    public void takeUserInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Guess the Number : ");
        this.Unumber = s.nextInt();
    }
    
    boolean isCorrectNumber(){
        if(Unumber==Rnumber){
            System.out.println("Congratulation! \nYou are Winner.\nThe guess number is " +Rnumber);
            return true;
        }
        else if (Unumber<Rnumber) {
            System.out.println("Your Number is Too Low\n");
        }
        else {
            System.out.println("Your Number is Too High\n");
        }
        return false;
    }

    public int getNoOfGuesses() {
        return NoOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        NoOfGuesses = noOfGuesses;
    }

    
}

public class Guess_the_Number_3 {
    public static void main(String[] args){
        Game g = new Game();
        g.setNoOfGuesses(10);
        System.out.println("You have " + g.getNoOfGuesses() + " chance to WIN \nGuess the number between 0 To 100.");
        
        for(int i=0; i<g.getNoOfGuesses(); i++){
            g.takeUserInput();
            if(g.isCorrectNumber()){
                break;
            }
            else if(i==g.getNoOfGuesses()-1){
                System.out.println("your lose!.\nThe guess number is: " +g.Rnumber+ "\nYou haven't more Chance '_' .");
            }
            
        }
        
        
    }
}
/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */