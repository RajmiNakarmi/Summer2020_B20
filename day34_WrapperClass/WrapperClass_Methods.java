package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a =Integer.parseInt(str);
        System.out.println(a + 1);
        System.out.println(str +1);


        Double d1 = Double.parseDouble("7.5");// wrapper class
       // double d2 = 12.5 -- primitive
        System.out.println(d1-1);

        String s1 = "true";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(!b1);
        System.out.println(s1);

        System.out.println("=======================================================");
        String s2 = "100000.5";
        double d2= Double.valueOf(s2); // unboxing

        System.out.println(d2*2);// multipling to check if the value is string or number


        String s3 = "False";
        boolean r2 = Boolean.parseBoolean(s3); //unboxing
        System.out.println(r2);

        }

    }

