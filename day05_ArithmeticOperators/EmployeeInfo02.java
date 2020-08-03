package day05_ArithmeticOperators;

public class EmployeeInfo02 {
    public static void main(String[] args) {
        String firstname = "John";
        String lastname = "Daniel";
        String gender = "Male";
        byte age = 35;
        String companyName = "CapitalOne";
        String jobTittle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        String fullName = firstname + " " + lastname;


        System.out.println("Employee's full name is: " + firstname + " " + lastname);
        System.out.println(fullName + "' gender" + " " + "is: " + gender);
        System.out.println(fullName + "' age is: " + age + " years old");
        System.out.println(fullName + " works at: " + companyName);
        System.out.println(fullName+ "' Job tille is: " + jobTittle);
        System.out.println(fullName + "' salary is " + salary + "$");
        System.out.println(fullName + " is full time employee: " + isFullTime);
        System.out.println(fullName+ " is married: " + isMarried);


    }

}
