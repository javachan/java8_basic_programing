package Java8.project2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class TestSorting {

	public static void main(String[] args) {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong",  33));
		result.add(new Developer("alvin",  20));
		result.add(new Developer("jason",  10));
		result.add(new Developer("david",  15));
		result.add(new Developer("neymar",  25));
		result.add(new Developer("iris",  55));
		System.out.println("Before Sort ----------------------------");
		int i =1;
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getName()+" "+developer.getAge());
			i++;
		}

		// sort by age
		Collections.sort(result, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				System.out.println("o1 : "+o1.getAge()+"    o2 : "+o2.getAge()+" : : : : : "+(o1.getAge() - o2.getAge()));
				return o1.getAge() - o2.getAge();
			}
		});
		i =1;
		System.out.println("After Sort ----------------------------");
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getName()+" "+developer.getAge());
			i++;
		}

	}


}
