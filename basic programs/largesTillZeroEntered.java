import java.util.Scanner;

public class largesTillZeroEntered {
   public static void main(String[] args) {
       Scanner input  = new Scanner(System.in);
       int number = 1;
       int largest = 0;
        
       while(number!=0){
           number = input.nextInt();
           if(number > largest){
               largest = number;
           }
       }
       System.out.println("Largest number out of the entered: " + largest);
       input.close();
   } 
}
