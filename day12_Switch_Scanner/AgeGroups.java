package day12_Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
         */
        // nestedif should be used in precondition

        int age = 156;
        String result2 ="";

        if (age >0 && age <= 150) {//<-- this is pre condition
/* if (age < 21) {
                result2 = "Teenager";
            } else if(age <= 55)  { // 0r  (age >= 21 && age < 55)
                result2 = "Adult";
            } else{
                result2 = "Senoir";
            }*/
            // using ternary
            result2 = (age<21)? "Teenger" : (age <= 55)? "Adult" : "senior";
        }else{
            result2 = "Not Valid";
        }
        System.out.println(result2);
    }
}




