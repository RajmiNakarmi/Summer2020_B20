package day11_NestedIf_switch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class NumberToWords {
    public static void main(String[] args) {
        int num = 6;

        String result = "";

        if (num == 0) {
            result = "zero";

        } else if (num == 1) {
            result = "one";

        } else if (num == 2) {
            result = "two";


        } else if (num == 3) {
            result = "three";

        } else if (num == 4) {
            result = "four";

        } else if (num == 5) {
            result = "five";

        } else if (num == 6) {
            result = "six";


        } else if (num == 7) {
            result = "seven";

        } else if (num == 8) {
            result = "eight";

        } else if (num == 9) {
            result = "nine";

        } else //(num < 0 || num >9){
            result = " invalid";
            System.out.println(result);
        }


    }



