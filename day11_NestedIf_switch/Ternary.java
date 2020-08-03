package day11_NestedIf_switch;

public class Ternary {

    /* verify if somebody is eligible to vote or not*/

    public static void main(String[] args) {


    int age = 20;
    boolean eligible = false; // temporary value

    if(age >=21) {
        eligible = true;

    } else {
        eligible = false;
    }
        System.out.println(eligible);

        System.out.println("=================================================================");
        //usins tenary method

        boolean eligibale2 = (age >= 21) ? true : false;
        System.out.println(eligibale2);

        System.out.println("====================================================================");
        // second task : "can vote" or "cannot vote"

        int age1 = 18;
        String citizen = "USA" ;
        String result = "";

        if (age1 >= 18 && citizen == "USA") {
            result = "can vote";
        }else{
               result ="Can not vote";

               }
        System.out.println(result);

        String result1 = (age >=21) ? "can vote" : "cannot vote" ;
        // with ternary



        //task 3.

        int n1 = 100;
        int n2 = 200;

        
        String r = (n1 == n2)? "Equal" : "NoT equal";

        System.out.println(r);

    }
}
