package Java8.project3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToList {

	public static void main(String[] args) {
        
		
		int[] number = {12, 21, 34, 46, 52, 61, 72, 86, 93, 10};
        List<Integer> list1 = Arrays.stream(number).boxed().collect(Collectors.toList());
        System.out.println("list : " + list1);  // output : list : [12, 21, 34, 46, 52, 61, 72, 86, 93, 10]
        
        String[] alphabet = new String[]{"AL�", "CELAL", "DERYA", "ACUN", "MEHMET"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        // A or B
        if (list.contains("AL�") || list.contains("B�LAL")) {
            System.out.println("1. Hello AL� or B�LAL");	// output : 1. Hello AL� or B�LAL
        }

        // A and B
        if (list.containsAll(Arrays.asList("AL�", "B�LAL"))) {
            System.out.println("2. Hello AL� or B�LAL");	// don't work
        }

        // A and C
        if (list.containsAll(Arrays.asList("AL�", "DERYA"))) {
            System.out.println("3. Hello AL� and DERYA");	// output : 3. Hello AL� and DERYA
        }

	}

}
