package day29_practice;
// check eligibility to vote

public class task_WithParameter2 {

    public static void main(String[] args) {
        vote(40, "Rajmi", true, "Biden");
        vote(6, "juju", true, "Biden");
    }

    public static void vote(int age, String name, boolean citizen, String candidate) {
       boolean eligibleToVote =      age>= 18 && citizen ==true;
       if(eligibleToVote){
           System.out.println(name + " is eligible to vote for" + candidate);
       }else{
           System.out.println(name + " is not eligible to vote for" + candidate);
       }
            }
        }
