package th.ac.nu.students.u54341598.compro.ch02;

import java.util.Scanner;

public class Prog_P2_8 {
    
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Price: ");
        double bookprice = in.nextDouble();
        System.out.print("Enter Number book: ");
        double numberbook = in.nextDouble();
        double tax = bookprice+bookprice*(7.5/100);
        double shipping = numberbook*2;
        double TotalPrice = numberbook * tax;
        System.out.println("Tax = "+tax);
        System.out.println("Shipping charge = "+ shipping);
        System.out.println("Price of the order : "+ (TotalPrice+shipping));
      }
    
}
