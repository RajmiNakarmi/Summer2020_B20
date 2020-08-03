package day34_WrapperClass;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 4,6};
        System.out.println(Arrays.toString(sortDesc(a)));

        Double [] b = { 1.1,3.3,.60};
        System.out.println(Arrays.toString(sortDesc(b)));

        Character [] c ={ 'c', '3', 'k'};
        System.out.println(Arrays.toString(sortDesc(c)));
    }

    public static Integer[]  sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer [arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts int array in descending order and returns it

    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts double array in descending order and returns it

    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts char array in descending order and returns it

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts String array in descending order and returns it

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2) {
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for (Double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Double each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
}