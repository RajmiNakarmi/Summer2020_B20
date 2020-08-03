package day29_practice;
//write a method that can print out the unique elements from an array of string
public class UniqueElement {
    public static void main(String[] args) {
       String[] arr =  {"A", "A", "B", "C", "C", "A","B","D"};
unique(arr);
        System.out.println("Hello");
    }
    public static void unique(String[] arr){ // approch to count the frequency
        for (String a : arr){
            int count = 0;

            for (String each : arr) {
                if (a.equals(each)) {
                    count++;
                }
            }
            // find unique
            if (count == 1) {
                System.out.println(a+ " ");
            }
        }
        System.out.println();
    }
}
