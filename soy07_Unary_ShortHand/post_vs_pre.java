package soy07_Unary_ShortHand;

public class post_vs_pre {

    public static void main(String[] args) {
       //pre
        int a= 10;
        System.out.println( ++a);//11
        System.out.println(a);//11

        //post
        int b =10;
        System.out.println(b++);//10
        System.out.println(b);//11
        System.out.println("=====================================================");

        int c= 25;
        int d= c++;//d= 25;
        // c+26

        System.out.println(c);
        System.out.println(d);

        System.out.println("=====================================================");
        //eg
        int e =27;
        e++;
        System.out.println(e);

        System.out.println("=====================================================");
        int x= 8;
        int y = x--;//y=8
        System.out.println(x);
        System.out.println(y);

        System.out.println("=====================================================");

        int X =2;
        int Y = X++;
        System.out.println(Y);

        System.out.println("=====================================================");

        System.out.println("=====================================================");
int B= 50;
B= --B + B ++ +B -- + B++;
//B= 49 + 49 + 50+ 49;
//B = 197
        System.out.println(B);

        int C =4;
        int D = C* 4  -C ++;
        // 4 * 4 - 4++
        // 16 -4
        //12
        System.out.println(C);
        System.out.println(D);









    }
}
