package Office_Hour.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true !=true;
        //           not true & doesnt equal to true
        //            false !=true
        System.out.println(r1);
        boolean r2 = !r1;
        System.out.println(r2);// false
        System.out.println(!false); //true

        System.out.println("=========================================================");
        // ||: either one is true away return trun
        boolean result1 = 9> 10 || "java" == "java";
        //               fasle || true == true
        System.out.println(result1);

        //&& lagic: all condition must to true to be true.
        boolean result2 = "Java" !="Python" &&  "Muhtar" !="Good Guy";
         //               true && true
        System.out.println(result2);
    }

}
