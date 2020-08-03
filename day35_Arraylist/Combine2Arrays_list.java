package day35_Arraylist;

import java.util.ArrayList;

/*
  3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class Combine2Arrays_list {
    public static void main(String[] args) {
        String[] group1 = {"kali", "kanchi", "thuli"};
        String[] group2 = {"mahili", "sahili", "gori", "Chuchi"};

        ArrayList<String> students = new ArrayList<>();

        for (String each : group1) {
            students.add(each);
        }
        for (String each : group2) {
            students.add(each);
        }

        System.out.println(students);
    }
}