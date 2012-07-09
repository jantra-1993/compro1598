package th.ac.nu.students.u54341598.compro.ch02;

   public class Widening {
       
    public static void main(String[] args) {
        
        int i = 1234567890;
        float f = i;
            System.out.println(i - (int) f); // -46
   }
  }