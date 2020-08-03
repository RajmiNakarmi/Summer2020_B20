package day35_Arraylist;

import java.text.CharacterIterator;
import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Ram");
        earlyBirdList.add("Krishna");
        earlyBirdList.add("Shiva");
        earlyBirdList.add("Sita");

        earlyBirdList.set(2,"Hari");
;
        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());


        System.out.println("===============================================");

       //remove method == primitive int --

        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


list.remove(2);
        System.out.println(list);

        System.out.println("======================================");


        //remove method == non primitive  --  remove by element

        ArrayList<Integer>list2= new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
//int a = 1;
Integer a = 1;
list2.remove(a);
        System.out.println(list2);

        System.out.println("================================================");

        ArrayList<String> t = new ArrayList<>();
        t.add("Ibrahim");
       t.add("Ram");
        t.add("Krishna");
      t.add("Shiva");
        t.add("Sita");

        t.remove("Ram");
        t.remove(3);

        boolean r = t.remove("Shiva");
        
        System.out.println(r);
        System.out.println(t);
    }
}
