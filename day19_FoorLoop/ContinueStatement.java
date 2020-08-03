package day19_FoorLoop;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  //i: 1, 2, 3, 4, 5

            if (i == 3) {
                continue;  // jumps to the next iteration
            }

            System.out.print(i + " "); // 1  2  4 5

        }

        System.out.println("==============================");

        for (char ch = 'A'; ch <= 'F'; ch++) { // ch: A B C D E F

            if (ch == 'C' || ch == 'F') {
                continue;
            }

            System.out.print(ch + " ");

        }

        System.out.println();

        System.out.println("=============================================================");

// print odd numbers between 1 to 50
        for (int n = 1; n <= 50; n++) {
            if (n % 2 == 0) {
                continue;
            }
                    System.out.println(n);
                }


            System.out.println("======================================");

            for (int n = 1; n <= 50; n++) {// in oder to print odd we can skip even number
                if (n % 2 != 0) {// if the nunber is odd, then skip
                    continue;
                }
                System.out.print(n + " ");
            }

        }
    }


