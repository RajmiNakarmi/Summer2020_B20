package day19_FoorLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            break;
        }
        System.out.println("======================================================");
        for (char ch = 'A'; ch <= 'H'; ch++) {

            System.out.println(ch + " ");
            if (ch == 'C') {
                break;
            }
            System.out.println(ch + " ");

        }
        System.out.println("===============================================================");

for(int x = 1000; x >= 100; x -=100){

    if(x == 500){
        break;
    }
    System.out.println(x+ " ");

}
    }
}
