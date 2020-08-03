package day24_Arrays;

import day04_variables.CarInfo;

/*
Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
 */
public class Average {
    public static void main(String[] args) {
        int []arr = {1, 2, 3,4,5,6,7,8,9,10};

        int sum =0;

        for(int i = arr.length -1; i>=0; i--){
            sum += arr[i]; // arr [] to enter the elements
        }
        System.out.println(sum);
        double average = sum/arr.length;// without casting
        System.out.println(average);

        double average1 = (double)sum/arr.length;// with casting double in int
        System.out.println(average1);
    }

}
