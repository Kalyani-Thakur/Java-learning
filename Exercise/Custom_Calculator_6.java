
import java.util.Scanner;

class Invalidinput extends Exception{
    public String toString(){
        return "Invalid Operator!";
    }
}
class ZeroException extends Exception{
    public String getMessage(){
        return "Cannot Divided by 0!";
    }
}
class MaxInput extends Exception{
    public String toString(){
        return "Inputs is greater than 100000";
    }
}
class MaxMultiplier extends Exception{
    public String getMessage(){
        return "Multiplication Input is greater than 7000";
    }
}

public class Custom_Calculator_6 {
    public static void main(String[] args) throws  MaxInput, Invalidinput, ZeroException, MaxMultiplier  {
        while(true){
            Double n1, n2;

            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter First no. ");
            n1 = sc.nextDouble();
            System.out.print("Enter First no. ");
            n2 = sc.nextDouble();

            if(n1>100000 || n2>100000){
                throw new MaxInput();
            }
            
            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            if(op!='+' && op!='-' && op!='*' && op!='/' && op!='%'){
                throw new Invalidinput();
            }
            else{
                switch (op) {
                    case '+':
                    System.out.println(n1 + " + " + n2 + " = " +(n1+n2));
                    break;
    
                    case '-':
                    System.out.println(n1 + " - " + n2 + " = " +(n1-n2));
                    break;
        
                    case '*':
                    if(n1>7000 || n2>7000){
                        throw new MaxMultiplier();
                    }else{
                        System.out.println(n1 + " * " + n2 + " = " +(n1*n2));
                        break;
                    }
        
                    case '/':
                    if(n2 == 0){
                        throw new ZeroException();
                    }else{
                        System.out.println(n1+" / "+n2 +" = "+(n1/n2));
                        break;
                    }
                    
                    case '%':
                    System.out.println(n1+" % " +n2+" = " +(n1%n2));
                    break;
                }     
            } 
        }
        
    } 
}

/*
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - 
Don't allow any multiplication input to be greater than 7000
*/