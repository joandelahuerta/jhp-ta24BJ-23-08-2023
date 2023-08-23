package M3;
import java.util.Arrays;
import java.util.Scanner;

public class Milestone01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // FASE 1
        String[] cityNames = new String[6];

        for (int i = 0; i < cityNames.length; i++) {
            System.out.print("Introduce el nombre de una ciudad: ");
            cityNames[i] = scanner.nextLine();
        }

        System.out.println("\nCiudades introducidas:");
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }

        // FASE 2
        Arrays.sort(cityNames);
        System.out.println("\nCiudades ordenadas alfabéticamente:");
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }

        // FASE 3
        String[] modifiedCityNames = new String[6];
        for (int i = 0; i < cityNames.length; i++) {
            modifiedCityNames[i] = cityNames[i].replaceAll("a", "4");
        }

        Arrays.sort(modifiedCityNames);
        System.out.println("\nCiudades modificadas y ordenadas alfabéticamente:");
        for (String modifiedCityName : modifiedCityNames) {
            System.out.println(modifiedCityName);
        }

        // FASE 4
        String[][] reversedCityNames = new String[6][];

        for (int i = 0; i < cityNames.length; i++) {
            int cityNameLength = cityNames[i].length();
            reversedCityNames[i] = new String[cityNameLength];
            for (int j = 0; j < cityNameLength; j++) {
                reversedCityNames[i][j] = String.valueOf(cityNames[i].charAt(cityNameLength - j - 1));
            }
        }

        System.out.println("\nNombres de ciudades invertidos:");
        for (String[] reversedCityName : reversedCityNames) {
            System.out.println(Arrays.toString(reversedCityName));
        }

        scanner.close();
    }

}
