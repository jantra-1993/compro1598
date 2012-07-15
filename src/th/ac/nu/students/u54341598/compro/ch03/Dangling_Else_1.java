package th.ac.nu.students.u54341598.compro.ch03;

public class Dangling_Else_1 {
    public static void main (String [] args){
        int x = 5;
        if (x < 5)
            if (x > 5)
                System.out.println('b');
        else
                System.out.println('a');
    }
}
