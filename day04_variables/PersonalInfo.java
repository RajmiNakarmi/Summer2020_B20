package day04_variables;

import java.lang.reflect.Field;

/*Task Creat a called PersonalInfo
First name
last
age
gender
country
ssn
employeed
 */
public class PersonalInfo {
    public static void main(String[] args) {
        String Firstname = "Rajmi";
        String Lastname ="Nakarmi";
        byte Age= 38;
        char Gender= 'F';
        long SSN = 123_345_8778;
        String Country = "Nepal";
        boolean Employeed = true;

        System.out.println("First Name: "+ Firstname);
        System.out.println("Last Name: "+ Lastname);
        System.out.println("Age: "+ Age);
        System.out.println("Gender: "+ Gender);
        System.out.println("SSN: "+ SSN);
        System.out.println("Country: "+ Country);
        System.out.println("Employeed:"+ Employeed);



    }

}
