package day11_NestedIf_switch;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 250;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";

        }
        System.out.println(result);
        // ternary ? means 1f and : means else

        String result2 = (num >0) ? "positive" : (num <0) ? "Negative" : "zero";

        System.out.println(result2);

        /*write a program that compare two numbers
        a=10, b= 20
        output : b is greater

        a= 30, b=10;
        output :a is greater
        a = 20; b= 20;
        output : a is equal to b
        */
        int a = 30;
        int b = 100;



String output = (a > b) ?a + "is greater" : (b > a) ? b +" is greater" : a +" equals to" + b;

        System.out.println(output);



    }
}
