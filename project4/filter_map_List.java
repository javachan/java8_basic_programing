package Java8.project4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_map_List {

	public static void main(String[] args) {


        List<Car> car = Arrays.asList(
                new Car("Opel", 2001),
                new Car("Mazda", 2005),
                new Car("peugeot", 2015),
                new Car("ferrari", 2018),
                new Car("Mercedes", 2004)
        );


        String name = car.stream()
                .filter(x -> "Mazda".equals(x.getName()))
                .map(Car::getName)                        //convert stream to String
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        List<String> collect = car.stream()
                .map(Car::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
	}

}
