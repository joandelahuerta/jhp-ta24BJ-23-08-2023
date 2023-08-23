package M2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Milestone01 {

	public static void main(String[] args) {
		String name = "Joan";
        String surname = "de la Huerta";

        char[] nameChars = name.toCharArray();

        List<Character> nameList = new ArrayList<>();
        for (char c : nameChars) {
            nameList.add(c);
        }

        List<Character> surnameList = new ArrayList<>();
        for (char c : surname.toCharArray()) {
            surnameList.add(c);
        }

        List<Character> fullName = new ArrayList<>(nameList);
        fullName.add(' ');
        fullName.addAll(surnameList);

        System.out.println("FullName: " + fullName);

        Map<Character, Integer> letterCounts = new HashMap<>();
        for (char letter : fullName) {
            if (Character.isLetter(letter)) {
                if (letterCounts.containsKey(letter)) {
                    letterCounts.put(letter, letterCounts.get(letter) + 1);
                } else {
                    letterCounts.put(letter, 1);
                }

                if (isVowel(letter)) {
                    System.out.println(letter + ": VOCAL");
                } else {
                    System.out.println(letter + ": CONSONANT");
                }
            } else if (Character.isDigit(letter)) {
                System.out.println("Els noms de persones no contenen números!");
                return;
            }
        }

        System.out.println("Aparicions de les lletres:");
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            System.out.println(letter + ": " + count + " vegades");
        }
    }

    public static boolean isVowel(char letter) {
        return "AEIOUaeiou".indexOf(letter) != -1;
    }

}
