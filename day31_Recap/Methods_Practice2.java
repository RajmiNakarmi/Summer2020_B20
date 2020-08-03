package day31_Recap;
/* use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
              uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class.*/
public class Methods_Practice2 {

    public static void main(String[] args) {
        String name = "madam";
        reverse1(name);
String rev = reverse2(name);
        System.out.println(reverse2(name));
        System.out.println(name.equalsIgnoreCase(reverse2(name)));

    }


    public static void reverse1(String str) {
        String expectedResult = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            expectedResult += str.charAt(i);

        }
        System.out.println(expectedResult);
    }

    public static String reverse2(String str) {
        String expectedResult = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            expectedResult += str.charAt(i);

        }
        return expectedResult;
    }
}