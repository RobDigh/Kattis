
import java.util.Scanner;

public class TakeTwoStones {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();

        if (stones <= 0 || stones > 10000000){
            return;
        } else {
            if ((stones & 1) != 0) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
