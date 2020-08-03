package day31_Recap;
import Library.Util;
/*
 use the methods removeDup and frequency in util class to create a thrid method called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3

 */
public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBBCCC";
        String expectedResult = " ";
        String nunDup = Util.removeDup(str);

        for (char each: str.toCharArray()){



        }

       /* char ch1 = nunDup.charAt(0);
        int count1 = Util.frequency(str,ch1);
        expectedResult += ""+ ch1 + count1;

        char ch2 = nunDup.charAt(1);
        int count2 = Util.frequency(str,ch2);
        expectedResult += ""+ ch2 + count2;

        char ch3 = nunDup.charAt(2);
        int count3 = Util.frequency(str,ch2);
        expectedResult += ""+ ch3 + count3;
*/

        System.out.println(expectedResult);
    }
}
