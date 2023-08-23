package M2;
import java.util.Scanner;

public class Milestone02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura que quieres: ");
        int height = scanner.nextInt();

        System.out.println("\nEscalera de números:");
        drawNumberScale(height);

        System.out.println("\nPirámide:");
        drawInvertedPyramid(height);

        scanner.close();
    }

    public static void drawNumberScale(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void drawInvertedPyramid(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
