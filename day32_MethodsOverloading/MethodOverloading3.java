package day32_MethodsOverloading;
/*
tasks2:
    1. create a method that can combine 2 arrays of integers
    2. create a method that can combine 2 arrays of double
    3. create a method that can combine 2 arrays of String
    4. create a method that can combine 2 arrays of char
    first solution: DO NOT use method overloading
    second solution: apply method overloading

 */
public  class MethodOverloading3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int[] arr1 = {45, 6, 4};

    }

    public static void combination1(int[] first, int[] second) {
        int[] arr1 = new int[first.length + second.length + 1];

        for (int i = 0; i < first.length; i++) {
            arr1[i] = first[i];


        }
    }
}
