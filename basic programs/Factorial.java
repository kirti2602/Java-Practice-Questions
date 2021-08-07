import java.util.Scanner;

public class Factorial{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int factNum = input.nextInt();
    int factorial = 1;

    //logic for finding factorial

    for(int i = 1; i <= factNum; i++){
        factorial *= i; 
    }

    System.out.println("Factorial of "+factNum + " is " + factorial);
    input.close();
}

}

