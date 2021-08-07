import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for P, R, and T");
        int P = input.nextInt();
        int R = input.nextInt();
        int T = input.nextInt();
        int simple_interest = 0;

        //calculating simple interest

        simple_interest = P * R * T;

        System.out.println("Simple Interest = "  + simple_interest);


    }
    
}
