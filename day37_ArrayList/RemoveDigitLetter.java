package day37_ArrayList;

import javafx.scene.shape.ClosePathBuilder;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitLetter {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','3','4','5','$','@','&','%'));
        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        System.out.println("================================================");
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','b','c','3','4','5','$','@','&','%'));



        ArrayList<Character> digits = new ArrayList<>();//[1,2]

        digits.addAll(list);
        digits.removeIf(p -> !Character.isDigit(p));

        System.out.println(digits);


        ArrayList<Character> letters = new ArrayList<>();// [a
        letters.addAll(list);
        letters.removeIf(p -> ! Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println(specialChar);

    }
}
