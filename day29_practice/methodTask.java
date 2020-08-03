package day29_practice;
/*
Create a method that can print odd numbers between 1-100
 */
public class methodTask {
    public static void main(String[] args) {
        oddNumner();
        System.out.println("Namaste");

        oddNumner();
        System.out.println("Namaste");

        evenNumber();
        System.out.println("Hello");
    }

    public static void oddNumner() {

       // for (int i = 1; i <= 100; i++) {
            //0r
             for (int i = 1; i <= 100; i+=2) {
           // if (i % 2 != 0) {
                System.out.print(i + " ");

            }
            System.out.println();
        }





    //task 2 Even
public  static void evenNumber(){
    for(int i = 2; i<= 100; i+=2){
        System.out.println(i+" ");
    }
    System.out.println();
}

}
