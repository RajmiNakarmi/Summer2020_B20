package day05_ArithmeticOperators;

/*
1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary

write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String firstname= "John";
        String lastname = "Daniel";
        String gender= "Male";
        byte age= 35;
        String companyName = "CapitalOne";
        String jobTittle= "SDET";
        boolean isFullTime= true;
        boolean isMarried= false;
        double salary= 120000.50;


        System.out.println("Employee's full name is: " + firstname +" " +lastname);
        System.out.println(firstname +" " +lastname+"' gender"+" "+"is: "+ gender);
        System.out.println(firstname +" " +lastname+"' age is: " +age+ " years old");
        System.out.println(firstname +" " +lastname+ " works at: " + companyName);
        System.out.println(firstname +" " +lastname+"' Job tille is: " + jobTittle);
        System.out.println(firstname +" " +lastname+"' salary is "+ salary+"$");
        System.out.println(firstname  +" "+ lastname + " is full time employee: " + isFullTime);
        System.out.println(firstname +" " +lastname + " is married: " + isMarried);


    }

}

