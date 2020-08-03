package day06_CompatisonOperations;

public class relationalOperators {
    public static void main(String[] args) {

        boolean r1 = 10>9; // > greater than
        System.out.println(r1);

        boolean r2 = 100<9000; // < less than
        System.out.println(r2);

        boolean r3 = 87 >= 85; // >= as fas as one condition is true, we get true

        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        boolean r5 =  200 <= 300;
        System.out.println(r5);

        boolean r6 = 900 == 800; //==: equal
        System.out.println( r6);
        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good guy"; // if the text are not same give you false
        System.out.println(r8);

        boolean r9 = "Muhtar" == "MUHTAR"; // false due to case senstative

        System.out.println(r9);
        // boolean r10 = "123" == 123
//!=
        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);

        boolean r12 = "true" != "fasle";
        System.out.println( r12);

        boolean result1 = 'A' == 65;
        System.out.println(result1);

        boolean result2 = 100 == 100.0; // value of 100 and 100.0 in accounting is same.
        System.out.println(result2);

        boolean result3 = (int) 10 == 10.9999999; // expilicit case(int) to get equal value
        System.out.println(result3);


      //task
       int number = 101;
       boolean even = number%2 ==0;
       boolean odd = number%2 ==0;
        System.out.println(even);
        System.out.println(even);

        int x =1000;
        boolean Even = x %2 ==0;
        boolean Odd = x %2 ==0;
        System.out.println(Even);
        System.out.println(Odd);

        int y = 130;
        boolean even1 = y % 3 ==0;
        boolean odd1 = y % 3 ==0;
        System.out.println("even = " + even1);
        System.out.println("odd = "+ odd1);






    }
}
