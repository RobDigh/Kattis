import java.util.Scanner;

public class R2 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int s = sc.nextInt();

        if ((r1 <= -1001 || r1 > 1000) || (s <= -1001 || s > 1000)) {
            return;
        } else {
            System.out.println((s*2) - r1);
        }
    }
}