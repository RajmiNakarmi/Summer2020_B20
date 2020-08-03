package day11_NestedIf_switch;

public class NestIf_practice1 {
       public static void main(String[] args) {


              int temperature = 65;
              boolean isRaining = true;

              if (temperature > 75) {
                     System.out.println(" dressup light");
                     if (isRaining) {
                            System.out.println("bring an umbrella");
                     } else {
                            System.out.println("bring Sunscreen");
                     }


              } else {
                     System.out.println("wear jeans");
              }

              System.out.println("=============================================");

              int salary = 100000;
             boolean experienceOf2Years = true;

              if(salary >= 30000) {
                     System.out.println("eligible for loan");
                     if (experienceOf2Years) {
                            System.out.println(" good,  2years working");

                     } else {
                            System.out.println("sorry, you dont have 2yr working");

                     }
              }else{
                     System.out.println("sorry, try again");

              }
       }

}
