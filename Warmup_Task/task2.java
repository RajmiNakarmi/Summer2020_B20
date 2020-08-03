package Warmup_Task;

public class task2 {
    /*2. Write an if statement that will print day of the week based on value of the day variable.
        Ex:
            num = 1
        output:
            "Monday"
            num = 8
        output:
            "There is no such a day!"
            num = 3

        output:
            Wednesday
*/
    public static void main(String[] args) {
        int day = 6;
        //String days = "";

        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2) {
            //days = "Tuesday";
            System.out.println("Tuesday");
        }
         else if (day == 3) {
           // days = "Wednesday";
            System.out.println("Wednesday");
        }

        else if (day == 4) {
           // days = "Thursday";
            System.out.println("Thursday");
        }
         else if (day == 5) {
            //days = "Friday";
            System.out.println("Friday");
        }

         else  if(day == 6) {
            //days = "Saturday";
            System.out.println("Saturday");

        } else if(day == 7) {
           // days = "Sunday";
            System.out.println("Sunday");

        }else {
            System.out.println(" seriuosly! there is no such day");

            }
            }

        }

