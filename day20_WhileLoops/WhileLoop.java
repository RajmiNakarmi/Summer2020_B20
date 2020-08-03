package day20_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 80;
        while (i >= 20) {
            if (i % 2 == 0) {
                System.out.println(i + "");
                i-=2;
            }
        }
    }
}

