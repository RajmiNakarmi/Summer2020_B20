package Office_Hour.Practice_06_24_2020;

import com.sun.org.apache.xerces.internal.util.XMLInputSourceAdaptor;

import javax.script.ScriptContext;
import java.util.Scanner;

public class SDET_Motors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter vehicle's year");

        int vehicalYear = input.nextInt ();

        if (vehicalYear >= 1995 && vehicalYear <= 1998 || vehicalYear >= 2001 && vehicalYear<= 2002
            || vehicalYear >=2004 && vehicalYear <= 2006 || vehicalYear >= 2015 && vehicalYear <= 2017) {
            System.out.println("Your vehicle needs to be recalled");

        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }




    }
}
