package day12_Switch_Scanner;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class RateCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");

       double salary = input.nextDouble();
        System.out.println("How hours do you work in a week");
        int weeklyHour = input.nextInt();

        int totalHours = weeklyHour *52;

        double hourlyRate = salary / totalHours;
        System.out.println("Your hourly rare is : $" + hourlyRate);
    }
}
