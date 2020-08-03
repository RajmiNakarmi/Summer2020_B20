package Office_Hour.Practice_06_30_2020;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

     /*    // forloop is the best method
     String str = "juju";//ju

        String result = " "; // to store output // ju

        for (int i = 0; i <= str.length()-1; i++) {//start from '0' boz of beginig indexnumber
            // can be used CharAt and substring
            //CharAt
            String s = "" + str.charAt(i);
            if (result.contains(s)) {
                continue;
            } else {
                result += s;

            }

        }
        System.out.println(result);*/
        // using Scanner
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String result = " "; // to store output // ju
        // forloop is the best method
        for (int i = 0; i <= str.length()-1; i++) {//start from '0' boz of beginig indexnumber
            // can be used CharAt and substring
            //CharAt
            String s = "" + str.charAt(i);
            if (result.contains(s)) {
                continue;
            } else {
                result += s;

            }

        }
        System.out.println(result);


    }
}