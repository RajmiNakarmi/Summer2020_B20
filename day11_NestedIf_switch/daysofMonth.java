package day11_NestedIf_switch;

/*

 */
public class daysofMonth {

    public static void main(String[] args) {

        int month = 6;
         switch(month){

             case 4:
             case 6:
             case 9:
             case 11:
             System.out.println("30days");
             break;

             case 2 :
                 System.out.println("28days");
                 break;

             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 System.out.println("31days");
                 break;




         }
    }
}

