package soy07_Unary_ShortHand;

public class ShortHand {

    public static void main(String[] args) {
        int a = 100;
        a *=a;
        System.out.println(a);

        int A = 100;
        A *= 3;
        System.out.println(A);

//addition Assignment
        int b = 100;
        b +=b;
        System.out.println(b);

        int z =300;
        z +=200; //z=z +200
        System.out.println(z);


        int c = 400;
        c -= 50;
        System.out.println(c);


        String schoolName = "Cybertek";
        schoolName +=" school";
        System.out.println(schoolName);

        String fullName= "Rajmi";
            fullName +=" Nakarmi";
        System.out.println(fullName);

        System.out.println("================================================================");
        /*
        /=Division assignment
               */
        int budget =10000;
        budget /= 2;
        System.out.println(budget);

        int budget1 =10000;
        budget1 /= 4;
        System.out.println(budget1);

        // remainder Assignment
        int f=100;
        f %= 3; // f=f%3 -- remainder will be 1.

        double num2 = 400.5;
        num2 %=2;
        System.out.println(num2);





    }
}
