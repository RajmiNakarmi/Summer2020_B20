package day12_Switch_Scanner;

public class Switch {
    public static void main(String[] args) {
        int a= 7;
        switch(a){
            case 5: // doesnot match case with expresson
                System.out.println(5);
                break;
            case 1:
                System.out.println("one");
               //break;
            case 2:
                System.out.println("two");
                break;
             // if non of the case that is matching we can provide default

            default:
                System.out.println("invalid  Case");
               break;
        }
    }
}
