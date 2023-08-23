package M3;
import java.util.Scanner;

public class Milestone02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double[][] grades = new double[5][3];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Introduce la nota de la asignatura " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = sum / grades[i].length;

            System.out.print("Alumno " + (i + 1) + " - Notas: ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            
            System.out.println("Promedio: " + average + " - " + (average >= 5 ? "Aprobado" : "Suspendido"));
        }

        scanner.close();
    }

}
