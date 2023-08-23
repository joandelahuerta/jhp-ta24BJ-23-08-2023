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

class InvalidTypeException extends Exception {
    public InvalidTypeException(String message) {
        super(message);
    }
}

class DishOrderedException extends Exception {
    public DishOrderedException(String message) {
        super(message);
    }
}

class DishReviewException extends Exception {
    public DishReviewException(String message) {
        super(message);
    }
}

public class Milestone03 {

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
            
            try {
                System.out.print("Que quieres comer?: ");
                int choice = scanner.nextInt();
                
                if (choice >= 1 && choice <= menu.length) {
                    String selectedDish = menu[choice - 1];
                    if (orderList.contains(selectedDish)) {
                        throw new DishOrderedException("No es valido.");
                    }
                    orderList.add(selectedDish);
                    totalPrice += prices[choice - 1];
                } else {
                    throw new InvalidChoiceException("Selecció invàlida. Introdueix un número vàlid de plat.");
                }
                
                System.out.print("Vols seguir demanant menjar? (1: Sí / 0: No): ");
                continueOrdering = scanner.nextInt();
                if (continueOrdering != 1 && continueOrdering != 0) {
                    throw new InvalidConfirmationException("Seleccion invalida. (1: Sí / 0: No");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero.");
                scanner.nextLine(); // Clear input buffer
            } catch (InvalidChoiceException | InvalidConfirmationException | DishOrderedException e) {
                System.out.println(e.getMessage());
            }
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
