package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,44,77 ,6,5,1,5,5));

        list.removeIf(p -> Collections.frequency(list,p)==1);
        System.out.println(list);
    }
}
 