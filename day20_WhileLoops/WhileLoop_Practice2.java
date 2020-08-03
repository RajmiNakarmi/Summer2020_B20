package day20_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {


        int num = 10; // innitalization
        while (num < 15) { //condition
        System.out.print( "Rajmi ");


num +=1;
    }


        System.out.println();

        String str = "Cybertek";
        //String result = " ";
        int indexNumber = str.length()-1;

        while( indexNumber >= 0){ // loop should be repeated

           // result += str.charAt(indexNumber);

            System.out.print(""+ str.charAt(indexNumber));

            indexNumber --;
        }
        System.out.println("=======================================");

}
}