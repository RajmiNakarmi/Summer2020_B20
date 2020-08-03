package Office_Hour.Practice_07_21_2020;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array_Desc2 {
    public static void main(String[] args) {
        int[] arr = {98, 97, 100, 200, 55, 68, 79};

        Arrays.sort(arr);//[55, 68, 79, 97, 98, 100, 200]
        System.out.println(Arrays.toString(arr));

        int[]descArr = new int [arr.length];
        int k= arr.length-1;
        for(int each :arr){ //[55, 68, 79, 97, 98, 100, 200]
            descArr[k]= each;
            k--;
        }

        System.out.println(Arrays.toString(descArr));
    }

}