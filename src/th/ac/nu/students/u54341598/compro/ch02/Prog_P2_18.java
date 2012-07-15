package th.ac.nu.students.u54341598.compro.ch02;

import java.util.Scanner;

   public class Prog_P2_18 {
       public static void main (String [] args){
           Scanner in = new Scanner(System.in);
           System.out.print("Enter First time : ");
           String first = in.nextLine();
           System.out.print("Enter Second time : ");
           String second = in.nextLine();
           int firstclock = Integer.parseInt(first.substring(0,2));
           int firstmin = Integer.parseInt(first.substring(2,4));
           int secondclock = Integer.parseInt(second.substring(0,2));
           int secondmin = Integer.parseInt(second.substring(2,4));
           if(secondclock < firstclock){
               secondclock = secondclock + 24;
           }
           if(secondmin < firstmin){
               secondclock = secondclock - 1;
               secondmin = secondmin + 60;
           }
           int resultclock = secondclock - firstclock;
           int resultmin = secondmin - firstmin;
           System.out.println(resultclock+" Hours " +resultmin+" Minutes");
       }
}
