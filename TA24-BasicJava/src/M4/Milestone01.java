package M4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Milestone01 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        int[] bills = {500, 200, 100, 50, 20, 10, 5};
        int totalPrice = 0;

        String[] menu = {"Ensalada", "Pasta", "Bocadillo", "Pollo", "Pechuga"};
        int[] prices = {20, 15, 12, 18, 25};

        List<String> orderList = new ArrayList<>();
        int continueOrdering = 1;
        
        while (continueOrdering == 1) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - " + prices[i] + "€");
            }
            
            System.out.print("Que quieres comer?: ");
            int choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= menu.length) {
                orderList.add(menu[choice - 1]);
                totalPrice += prices[choice - 1];
            } else {
                System.out.println("No es valido.");
            }
            
            System.out.print("Quieres algo mas? (1: Sí / 0: No): ");
            continueOrdering = scanner.nextInt();
        }

        System.out.println("\nPedido:");
        for (String item : orderList) {
            System.out.println(item);
        }
        System.out.println("Total: " + totalPrice + "€");

        System.out.println("\nBilletes necesarios:");
        for (int bill : bills) {
            int count = totalPrice / bill;
            if (count > 0) {
                System.out.println(count + " billete(s) de " + bill + "€");
                totalPrice %= bill;
            }
        }
        
        scanner.close();
    }

}
