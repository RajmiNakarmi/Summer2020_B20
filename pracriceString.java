public class pracriceString {

    public static void main(String[] args) {

        String s1 = "dog";
        String s2 = "dog";
        System.out.println(s1 == s2);//true

        String s3 = new String("dog");
        String s4 = new String("dog");

        System.out.println(s3 == s4);//false
        System.out.println(s1 == s3);

        String s5 = "Dog";
        System.out.println(s1 == s5);

        // charAt= to get single character return

        String word = "Trekking";
//                     012345678

        char cha = word.charAt(6);
        System.out.println(cha);

        char cha1 = word.charAt(2);
        System.out.println(cha1);

        // length

        String str = "Hybird phone is the best";
        int n1 = str.length();
        System.out.println(n1);
        System.out.println("length = "+ n1);


        String str1= " it is so much fun to go trekking, i love nature";
        int n2 = str1.length();
        System.out.println(n2);
        System.out.println(str1.length()-1);

        // upperCase && LowerCase

        System.out.println(str1.toUpperCase());

        //lowerCase
        System.out.println(str1.toLowerCase());
//subString

        String str2 = "Thank you for everything";
                     //01234567890
        String word1 = str2.substring(4, 20);
        System.out.println(str2);
        System.out.println(word1);


    }
}