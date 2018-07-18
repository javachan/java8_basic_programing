package Java8.project3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToList {

	public static void main(String[] args) {
        
		
		int[] number = {12, 21, 34, 46, 52, 61, 72, 86, 93, 10};
        List<Integer> list1 = Arrays.stream(number).boxed().collect(Collectors.toList());
        System.out.println("list : " + list1);  // output : list : [12, 21, 34, 46, 52, 61, 72, 86, 93, 10]
        
        String[] alphabet = new String[]{"ALÝ", "CELAL", "DERYA", "ACUN", "MEHMET"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        // A or B
        if (list.contains("ALÝ") || list.contains("BÝLAL")) {
            System.out.println("1. Hello ALÝ or BÝLAL");	// output : 1. Hello ALÝ or BÝLAL
        }

        // A and B
        if (list.containsAll(Arrays.asList("ALÝ", "BÝLAL"))) {
            System.out.println("2. Hello ALÝ or BÝLAL");	// don't work
        }

        // A and C
        if (list.containsAll(Arrays.asList("ALÝ", "DERYA"))) {
            System.out.println("3. Hello ALÝ and DERYA");	// output : 3. Hello ALÝ and DERYA
        }

	}

}
