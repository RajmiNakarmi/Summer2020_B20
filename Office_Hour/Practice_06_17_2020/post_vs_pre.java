package Office_Hour.Practice_06_17_2020;

public class post_vs_pre {
    public static void main(String[] args) {
        int a =300;
        System.out.println( ++a); //a =301
        System.out.println( ++a);//a= 302

        //pre decrement
        int b = 50;
        System.out.println(--b);//b =49
        System.out.println(--b); //b =48

        System.out.println("===========================================================");
        //post drecrement
        int x = 40;
        System.out.println(x --); //40
        System.out.println(x);//39
        System.out.println(x --);//39
        System.out.println(x);//38

        //post increment

        int y = 60;
        System.out.println(y ++ );//60
        System.out.println(y);//61
        System.out.println(y++);//61
        System.out.println(y);//62

    }
}
