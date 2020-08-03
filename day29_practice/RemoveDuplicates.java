package day29_practice;
// write a method that can remeove the duplicates from the string

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abababababaccccccccddddddddeeeee";

     Removeduplicate(str);
    }
    public static void Removeduplicate(String str){ // eg =abab
        String nonDup =" "; // not contian add //"ab"

        for (String each: str.split(" ")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }
}
