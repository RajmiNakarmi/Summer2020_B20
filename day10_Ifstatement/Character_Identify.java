package day10_Ifstatement;

public class Character_Identify {
    /*1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
     */
    public static void main(String[] args) {

        char character = 'A';
        boolean isCharacter = (character >= 65 &&  character <= 90) || (character >= 97 && character <= 122);
                    //          true || true

        if (isCharacter == true){
            System.out.println(isCharacter);
        }

    }
}
