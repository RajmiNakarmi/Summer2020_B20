package day08_LogicalOperators;

public class postAndpre {
    public static void main(String[] args) {
        int a= 200;
        int b = -a++ + - --a * a-- % 2;
        //b = -200 + -200 * 200 %2
        // b = -200 -200 * 200 %2
        // b = -200 - 40000%2
        // b = -200 _0 = -200
        System.out.println(b);
        System.out.println(a);

        System.out.println("==================================================================");
          int x = 300;
          int y =400;
           int z = x + y - x * y + x/y;
           // z= 300 + 400 _ 300 * 400 + 300/400
          // z =




    }
}
