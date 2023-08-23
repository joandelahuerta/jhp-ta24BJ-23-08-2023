package M3;
import java.util.Scanner;

public class Milestone03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número N para la secuencia de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Secuencia de Fibonacci hasta " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
