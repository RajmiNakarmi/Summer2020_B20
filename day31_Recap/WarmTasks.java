package day31_Recap;

import org.omg.CORBA.WStringSeqHelper;

public class WarmTasks {
    /*
    write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2

     */
    public static void main(String[] args) {


    }
    public static int frequency (String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()){
            if (each == ch){
                count++;
            }
        }
          return count;
    }
}
