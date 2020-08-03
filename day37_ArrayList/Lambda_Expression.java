package day37_ArrayList;
import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 12, 3, 1, 5, 7, 4, 3, 3, 5, 23, 4, 6));

        Predicate<Integer> lessThan5 = p -> p < 5;
        list.removeIf(lessThan5);
        //  OR  list.removeIf(p -> p<5);
        System.out.println(list);

        System.out.println("=====================================");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        Predicate<Integer> oddNumbers = p -> p % 2 != 0;

        numbers.removeIf(oddNumbers);
        System.out.println(numbers);

        numbers.removeIf(p -> p % 2 == 0);// remove if number is even
        System.out.println(numbers);

        System.out.println("============================================");
        // to remove name started it M
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Mehray", "Musti", "Aumeyra", "Rajmi"));
        names.removeIf(each -> each.startsWith("M") && each.endsWith("y"));
        System.out.println(names);

        System.out.println("========================================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,3 ,6 ,4 ,3 ,3,7,6,8));
        nums.removeIf(p -> Collections.frequency(nums,p)!=1); // for the elemnt that os not unique
        System.out.println(nums);

        System.out.println("==================================================");


    }
}