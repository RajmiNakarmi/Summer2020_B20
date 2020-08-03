package soy07_Unary_ShortHand;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Positive_Negative_0 {
    /* write a problem that can verify if a number is positive, negative,0
   number = 120
   output:
   120 is a positve number? true
   120 is negative number ? false
   12 is zero? false
     */
    public static void main(String[] args){
    int num= 120;
    boolean positive = num>0;
    boolean negative = num <0;
    boolean zero = num ==0;


        System.out.println(num + " is positive? "+positive);
        System.out.println(num + " is negative? "+negative);
        System.out.println(num + " is zero? "+zero);



    }
}
