package day28_recap;
/*
 write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop

 */
import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word =scan.next();
        int l = word.length();

        int count = 0;
        for(int i= 0; i <= str.length()-l; i++){
            if( str.substring(i,i+l).equalsIgnoreCase(word)  ){
                count++;
            }
        }

        System.out.println(count);



    }


}
