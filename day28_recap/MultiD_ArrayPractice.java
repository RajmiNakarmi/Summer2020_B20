package day28_recap;

import java.util.Arrays;

public class MultiD_ArrayPractice {

    public static void main(String[] args) {

        String[] group21 = {"Alla", "Alim", "Oman", "Cinthya", "Cornor", "Anton"};
        String[] group20 = {"Paban", "Adam", "Iman", "Bursa"};
        String[] group19 = {"Aman", "Zarina", "Ali", "Paola", "Baris"};
        String[] group1 = {"Mickey", "Mini", "Pluto", "Donald", "Goofy"};

        String[][] Batch20 = {{"Mickey", "Mini", "Pluto", "Donald", "Goofy"}, {"Aman", "Zarina", "Ali", "Paola", "Baris"}, {"Paban", "Adam", "Iman", "Bursa"}, {"Alla", "Alim", "Oman", "Cinthya", "Cornor", "Anton"}};

        for (int i = 0; i <= Batch20.length - 1; i++) {// to get each of array
            String[] eachgroup = Batch20[i];
            // System.out.println(Arrays.toString(eachgroup));

            for (int j = 0; j <= eachgroup.length - 1; j++) {// each name from each array
                String eachStudent = eachgroup[j];
                if (eachStudent.toLowerCase().contains("m")) ;
                System.out.print(eachStudent + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //System.out.println(   Arrays.toString(Batch20[1]  ) );System.out.println(  Arrays.toString( Cybertek[2]  )  );
}