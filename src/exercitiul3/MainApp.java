package exercitiul3;
import java.util.Scanner;
public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar natural: ");
        int n = sc.nextInt();
        int i;
        System.out.println("Divizorii numarului " + n + " sunt: ");
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        boolean isPrime = true;
        if (n <= 2) {
            isPrime = false;
        } else {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("ESTE prim");
        } else {
            System.out.println("NU este prim");
        }
    }
}
