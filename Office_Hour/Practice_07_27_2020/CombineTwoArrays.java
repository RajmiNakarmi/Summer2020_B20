package Office_Hour.Practice_07_27_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        char[] a1 = {'A', 'B', 'C', 'G'};
        char[] a2 = {'R', 'D', 'E', 'F'};

        char[] a3 = new char[a1.length + a2.length];

        int index = 0;

       /* a3[0] = a1[0];//A
        a3[1] = a1[1];//B
        a3[2] = a1[2];//A
        a3[3] = a1[3];

        a3[4] = a2[0];//D
        a3[5] = a2[1];//E
        a3[6] = a2[2];//F
        a3[7] = a1[3];
*/

        for (char each : a1) {
            a3[index] = each;
            index++;
        }
        for (char each : a1) {
            a3[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(a3 ));
    }
}


