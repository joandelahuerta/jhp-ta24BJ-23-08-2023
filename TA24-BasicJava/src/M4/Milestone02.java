package M4;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String message) {
        super(message);
    }
}

class InvalidConfirmationException extends Exception {
    public InvalidConfirmationException(String message) {
        super(message);
    }
}

public class Milestone02 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Bitllets disponibles
        int[] bills = {500, 200, 100, 50, 20, 10, 5};
        int totalPrice = 0;
        
        // Menú i preus
        String[] menu = {"Ensalada", "Pasta", "Bocadillo", "Pollo", "Pechuga"};
        int[] prices = {20, 15, 12, 18, 25};
        
        // Demanar menjar
        List<String> orderList = new ArrayList<>();
        int continueOrdering = 1;
        
        while (continueOrdering == 1) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - " + prices[i] + "€");
            }
            
            try {
                System.out.print("Que quieres comer?: ");
                int choice = scanner.nextInt();
                
                if (choice >= 1 && choice <= menu.length) {
                    orderList.add(menu[choice - 1]);
                    totalPrice += prices[choice - 1];
                } else {
                    throw new InvalidChoiceException("No es valido.");
                }
                
                System.out.print("Quieres algo mas? (1: Sí / 0: No): ");
                continueOrdering = scanner.nextInt();
                if (continueOrdering != 1 && continueOrdering != 0) {
                    throw new InvalidConfirmationException("Seleccion invalida. (1: Sí / 0: No");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero.");
                scanner.nextLine(); // Clear input buffer
            } catch (InvalidChoiceException | InvalidConfirmationException e) {
                System.out.println(e.getMessage());
            }
        }
        
        // Mostrar comanda i preu total
        System.out.println("\nPedido:");
        for (String item : orderList) {
            System.out.println(item);
        }
        System.out.println("Total: " + totalPrice + "€");
        
        // Càlcul de bitllets
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
