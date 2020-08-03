package day08_LogicalOperators;

public class practice2 {
    public static void main(String[] args) {
        int age = 12;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligiableAge = age >= 18;
                            // 12>= 18 ==. false
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                          // "USA" == "USA" || "france" == "USA"
                         // TRUE // FALSE ==> TRUE
        boolean eligibleToVote = eligiableAge && usCitizen;
        //                         false && true ==. false

        System.out.println(eligibleToVote);

       
    }
}
