package day29_practice;

public class PalindromeTask {

    public static void main(String[] args) {

        palindrum("level");

    }
    public static void palindrum(String word){

            String reversed = "";
            for(int i = word.length()-1; i >=0; i--){
                reversed += word.charAt(i);
            }

            System.out.println( reversed.equalsIgnoreCase(word) );
        }
}
