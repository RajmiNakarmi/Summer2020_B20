package day08_LogicalOperators;

public class LittersToGallons {
    // convert litters to gallons
    // 1 Litter =
    public static void main(String[] args) {
        double Litters = 100;
        double Gallons =  Litters/ 3.785;

        System.out.println(Litters + " litters eqaula to " + (int) Gallons+ " gallons");
        //applied (int) in println to take out decimals.(0.00)
    }
}
