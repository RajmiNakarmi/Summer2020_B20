package dayy30_CustomMethods;
import Library.Util;
public class ReturnMethods5 {

    public static void main(String[] args) {



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
            result += " "+ch+count;
        }
        System.out.println(result);
    }
}

