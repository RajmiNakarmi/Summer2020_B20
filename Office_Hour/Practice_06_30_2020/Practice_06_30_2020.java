package Office_Hour.Practice_06_30_2020;

import com.sun.org.apache.xpath.internal.objects.XString;

//odd or even == if esle statement
public class Practice_06_30_2020 {
    public static void main(String[] args) {
     int num = 305;

     if(num %2 == 0){
         System.out.println( num + " is even number");
     }else{
         System.out.println(num + " is odd number");

         //or
         //if(num %2!=0){
        // System.out.println(num + " is odd number");

         // tearnay
         String result2 = (num %2 ==0) ? num+" is even number":num + " is odd number";
         System.out.println(result2);

         //multi Branch if statement
     }
    }

}
