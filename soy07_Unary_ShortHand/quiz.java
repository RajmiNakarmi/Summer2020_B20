package soy07_Unary_ShortHand;

public class quiz {
    public static void main(String[] args){

    float a = 100.987_6543f;
    short b = (byte) a;
    byte c = (byte) b;
        System.out.println(c);

    int a1 = 3;
    int b1 = 2;
    long c1 = (a1 + b1) * 2 / 3 % 2;
        System.out.println(c1);

    long A = 3_000l;
    double B = (float) A;
    int C = (short) B;

        System.out.println(c%1000);
}
}
