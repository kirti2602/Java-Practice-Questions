import java.util.Scanner;

public class factors {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("Factors of "+ num + " : ");
    for(int i = 1; i <= num; i++){
        if(num % i == 0){
            System.out.println(i);
        }
    }
    input.close();
}

}
