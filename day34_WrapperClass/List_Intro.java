package day34_WrapperClass;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<Integer>();
        scores.add(95);//autoboxing // size of array is 0 index
        scores.add(100);              // size of array is i index
        scores.add(85);
        scores.add(75);
        scores.add(1,65);
        System.out.println(scores);

      // to get 100 out
        System.out.println(scores.get(2));

        System.out.println(scores.size());

    }
}
