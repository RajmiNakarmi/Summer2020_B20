package day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {
        double angle1 = 90;
        double angle2 = 60;
        double angle3 = 20;

        boolean valid = angle1  + angle2 +angle3 == 180;
        boolean invalid = !valid;
      if (valid){
            System.out.println(" valid Triangle");

        }
        if (invalid){
            System.out.println(" valid Triangle");
    }
}
}