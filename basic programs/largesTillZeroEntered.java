//TAKE AN INTEGER AS INPUT AND KEEP DOING TILL USER ENTERS 0. FIND THE LARGEST NUMBER ENTERED IN THIS LIST

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
