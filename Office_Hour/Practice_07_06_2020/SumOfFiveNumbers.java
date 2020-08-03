package Office_Hour.Practice_07_06_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SumOfFiveNumbers {
    /*
    write a program that can ask the user enter a number for five
    times and the returns the sum of those five numbers
     */
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int sum = 0; // 10 + 20 + 30 + 40 + 50 = 150

        for(int i = 1; i <= 500; i += 1){

        System.out.println("Enter a number: ");
        int num = scan.nextInt(); // 10 , 20, 30, 40, 50
        sum += num;

    }

        System.out.println(sum);






    }

}
