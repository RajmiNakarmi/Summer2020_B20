package day32_MethodsOverloading;
import Library.Util;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        String firstName = "elKem";
        String lastName = "emEt";

        String fullName;

       fullName = Util.formatFullName(firstName,lastName);
        System.out.println(fullName);

        String uniqes = Util.uniques(fullName);// assign to lowecase to ignore case sensitivity
        System.out.println(uniqes);

        String reverseName = Util.reverse(fullName);
        System.out.println(reverseName);

        System.out.println("=================================================");

        int []a= {200,400, 500, 1, 54, 343,34,40};
        int  n = 2500;

        a= Util.addElement(a,n);
        System.out.println(Arrays.toString(a));
    }


}
