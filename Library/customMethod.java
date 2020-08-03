package Library;

import Library.customMethod;

public class customMethod {

    public static void removeDup(String str){  //"abab"
        String nonDup = ""; //"ab"

        //[a, b, a, b]
        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }



    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }


    public static void charFrequency(String str) {

        String str1 = "jujuraja";
        String result = "";

        for (int j = 0; j <= str1.length() - 1; j++) {

            char ch = str1.charAt(j);
            int count = 0;
            for (int i = 0; i <= str1.length() - 1; i++) {
                char each = str1.charAt(i);
                if (each == ch) {
                    count += 1;
                }
            }
            result += " "+ch+count;
        }
        System.out.println(result);
    }

}


