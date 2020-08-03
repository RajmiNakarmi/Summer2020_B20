package day03_sequences_variables;

public class Salarycalculator {

    public static void main(String[] args) {
  /*Total tax:
    salary = 100000
    Tax = 0.28
            100000 *0.28 = 28000;
    100000 -28000 =72000 */

        double salary = 100000.0;
        double tax = 0.28;
        double totalTax = 100000 * 0.28;


        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);

    }
}
