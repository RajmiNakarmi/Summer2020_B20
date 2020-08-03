package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {
        char ch = 'A';
        while (ch <= 'E') {

// to not to print 'c'
            if (ch == 'C') {
                ch++;
                continue;// skips everthing even the iterator
            }
            System.out.println(ch);
            ch++;
        }

        System.out.println("==============================================");

       // System.exit(0);
        //System.out.println("done");
    }
}