package day23_Arrays;

import java.util.Scanner;

/*
write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                        01234567
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps




 */
public class FrequencyOfChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String nonDup = "";  //"BCD"
        // ab

        for(int i =0; i <= str.length()-1; i++){  // remove duplciates from str and added to nonDup
            String ch = ""+ str.charAt(i);   // B, B, C, C, D, D

            if(nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }

        }

        String expectedResult = "";    //"B2C2D2"

        // str = "BBCCDD"      nonDup = "BCD"    ===> "B2C2D2"

        for(int j=0; j <= nonDup.length()-1; j++){ // iterates the string nonDup

            char ch = nonDup.charAt(j);  // B, C, D   every single characters from nonDup
            int count = 0; // 2,  2,   2    frequnecy of every single ch

            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            expectedResult += ""+ch + count;

        }

        System.out.println(expectedResult);


        /*
        the reason we need nested loop:
         char ch1 = nonDup.charAt(0);  //B
            int count1 = 0; // frequnecy of B
            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch1){
                    count1++;
                }
            }
            expectedResult += ""+ch1 + count1;
             char ch2 = nonDup.charAt(0);  //C
            int count2 = 0; // frequnecy of C
            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch2){
                    count2++;
                }
            }
            expectedResult += ""+ch2 + count2;
             char ch3 = nonDup.charAt(0);  //D
            int count3 = 0; // frequnecy of D
            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch3){
                    count3++;
                }
            }
            expectedResult += ""+ch3 + count3;
         */


    }

}
