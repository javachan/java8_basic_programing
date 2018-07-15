package Java8.project3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class foreach_and_List_2 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("fatih");
		items.add("bilal");
		items.add("feride");
		items.add("gül");
		items.add("haydar");
		items.add("tolga");
		items.add("zeki");
		
		for(String item : items){
			System.out.print(item+" "); 		//fatih bilal feride gül haydar tolga zeki 
		}
		System.out.println("\n"); 
		
		
		items.forEach(item->System.out.print(item+" "));
		System.out.println("\n"); 			//fatih bilal feride gül haydar tolga zeki 
		
		
		items.forEach(System.out::print); 		//fatihbilalferidegülhaydartolgazeki
		System.out.println("\n");
		
		
		items.forEach(item->{
			if("haydar".equals(item)){
				System.out.println(item); 	//haydar
			}
		});
		
		
		List<String> alphaUpper = new ArrayList<>();
		for (String s : items) {
		    alphaUpper.add(s.toUpperCase());
		}

		System.out.println(items); 		//[fatih, bilal, feride, gül, haydar, tolga, zeki]
		System.out.println(alphaUpper); 	//[FATÝH, BÝLAL, FERÝDE, GÜL, HAYDAR, TOLGA, ZEKÝ]

		// Java 8
		List<String> collect = items.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(collect);		//[FATÝH, BÝLAL, FERÝDE, GÜL, HAYDAR, TOLGA, ZEKÝ]

	}

}
