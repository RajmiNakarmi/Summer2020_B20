package day08_LogicalOperators;

public class practice {
    public static void main(String[] args) {
        String firstName = "Harry";
        String lastName = "johnson";
        int age = 39;
        String citizen1 = "FRANCE";
        String citizen2 = "UK";

        String fullName = firstName + " " + lastName;
        boolean eligibleAge = age >= 18;
                               // 21>= 18 ==>true

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                           // "USA" == "USA" || "NEPAL" == "USA"
                          // true              // false

                          // true

        boolean eligibleToVote = eligibleAge && usCitizen;
                              // true && true ==> true

        System.out.println(fullName+ " is eligible to vote for Trump: " + eligibleToVote);



    }
}
