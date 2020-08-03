package Office_Hour.Practicce_07_13_2020;



public class charFrequency {

    public static void main(String[] args) {


        // public static void charFreq(String str) {
        String str1 = "jujuraja";
        String result = "";

        for (int j = 0; j <= str1.length() - 1; j++) {

            char ch = str1.charAt(j);
            int count = 0;
            for (int i = 0; i <= str1.length() - 1; i++) {
                char each = str1.charAt(i);
                if (each == ch) {
                    count += 1;
                }
            }

           if (count == 1) {
                result += ch;
            }
        }
        System.out.println(result);
    }

}
