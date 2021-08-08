import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if(x > y){
            System.out.println("x = "+ x + " is larger");
        }
        else{
            System.out.println("y = "+ y + " is larger");
        }
        input.close();
    }
        
    
}
