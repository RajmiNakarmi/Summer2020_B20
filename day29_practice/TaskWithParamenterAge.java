package day29_practice;
//Create a method that can calculate the age of the
public class TaskWithParamenterAge {
    public static void main(String[] args) {

        age(2005,1912);
    }
    public static void age(int birthYear, int currerntYear){
        if(currerntYear <birthYear){
            System.out.println("Invalid Entry"); // tp stop bug from getting mins(-) numbers

            }else{
            System.out.println("Valid");


        }
        int age = currerntYear - birthYear;
        System.out.println("You are "+ age+" years old");
    }
}
