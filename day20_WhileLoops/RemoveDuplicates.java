package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
      /*  String str = "aabggbhkkkgggkkllb";
        String result = " "; // this string to remove the dupilcate from Str

        for(int i = 0; i <= str.length()-1; i++ ){


        String s = ""+ str.charAt(i);

        if (!result.contains(s)) {
            result +=s;
        }

        }
        System.out.println(result);*/

        //using scanner
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //"ab"
        String result = " ";
        for(int i = 0; i <= str.length()-1; i++  ){

            //  String s =  ""+str.charAt(i);  //a,  b,  a,  b
            String s = str.substring(i, i+1);

            if( !result.contains(s) ){
                result += s;
            }

        }

        System.out.println(result);


    }
    }
