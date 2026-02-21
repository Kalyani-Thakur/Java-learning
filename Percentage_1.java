
import java.util.Scanner;
public class Percentage_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	     
	     System.out.print("Enter physics marks = ");
	     int sub1 = sc.nextInt();
	     
	     System.out.print("Enter Chemistry marks = ");
	     int sub2 = sc.nextInt();
	     
	     System.out.print("Enter Biology marks = ");
	     int sub3 = sc.nextInt();
	     
	     System.out.print("Enter Math marks = ");
	     int sub4 = sc.nextInt();
	     
	     System.out.print("Enter Hindi marks = ");
	     int sub5 = sc.nextInt();
	     
	     int Total = (sub1 + sub2 + sub3 + sub4 + sub5);
	     System.out.println("Total marks = " +Total);
	     
	     float percentage = Total*100/500;
	     System.out.println("Percentrage = " + percentage + "%");

         sc.close();
    }
}

/*
Write a program to calculate the percentage of a 
given student in the CBSE board exam. His marks from 5 subjects
must be taken as input from the keyboard. (Marks are out of 100)
 */