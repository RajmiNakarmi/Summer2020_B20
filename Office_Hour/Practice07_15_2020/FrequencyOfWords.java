package Office_Hour.Practice07_15_2020;

public class FrequencyOfWords {

    public static void main(String[] args) {
        String str = "JavajavaJavajava".toLowerCase();
        int count = 0;

        while (str.contains("java")) {//true
            count++;
            str = str.replaceFirst("java", "");


        }
        System.out.println(count);
    }
}
