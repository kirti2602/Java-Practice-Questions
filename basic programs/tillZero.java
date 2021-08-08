import java.util.Scanner;
public class tillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        while(number!=0){
            number = input.nextInt();
            sum += number;
        }
        System.out.println("Sum of numbers entered : " + sum);
        input.close();
    }


}
