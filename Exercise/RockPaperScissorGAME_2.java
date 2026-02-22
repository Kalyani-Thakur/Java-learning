
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGAME_2 {
    public static void main(String []args){
    //     rock = 0, paper = 1, scissor=2
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        while(condition){
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor. ");
        System.out.print("Enter your choice : ");
        int SonamInput = sc.nextInt();

         Random r = new Random();
         int ComputerInput = r.nextInt(3);
        
        if(SonamInput==ComputerInput){
            System.out.println("Draw");
        }
        else if(SonamInput == 0 && ComputerInput == 2 || SonamInput == 1 && ComputerInput == 0 || SonamInput == 2 && ComputerInput == 1){
            System.out.println("Sonam is winner!");
            condition = false;
        }
        else{
            System.out.println("Computer is Winner!");
        }
        
        // System.out.println("Computer Input is : " +ComputerInput);
         if(ComputerInput==0){
             System.out.println("Computer choice 0: Rock\n");
         }
         else if(ComputerInput==1){
             System.out.println("Computer choice 1: Paper\n");
         }
         else if(ComputerInput==2){
             System.out.println("Computer choice 2: Scissor\n");
         }
         
        }
        System.out.println("Thanks for Using this Game!");
        sc.close();
    }
}


