package day37_ArrayList;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20,30,40,100,1,-1,-900,500));

        // to find maximum number
        Integer max = Collections.max(list);

         //to find minimim number
        Integer min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);



    }
}
