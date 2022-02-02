package com.company;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //1
        List<Person> personer = new ArrayList<>() {{
            add(new Person("Pelle", Gender.MALE, 24000));
            add(new Person("Kajsa", Gender.FEMALE, 27500));
            add(new Person("Peter", Gender.MALE, 34000));
            add(new Person("Paula", Gender.FEMALE, 38000));
            add(new Person("Lukas", Gender.MALE, 22300));
            add(new Person("Linda", Gender.FEMALE, 26420));
            add(new Person("Micke", Gender.MALE, 26400));
            add(new Person("Johanna", Gender.FEMALE, 22222));
            add(new Person("Max", Gender.MALE, 40000));
            add(new Person("Karin", Gender.FEMALE, 38500));
        }};

        //1.1
        OptionalDouble kvinnor = personer.stream()
                .filter(x -> x.getGender().equals(Gender.FEMALE))
                .map(x -> x.getSalary())
                .mapToDouble(x -> x)
                .average();
        System.out.println("Snittlönen för en kvinna är: "+ kvinnor.getAsDouble()+ "kr");

        OptionalDouble män = personer.stream()
                .filter(x -> x.getGender().equals(Gender.MALE))
                .map(x -> x.getSalary())
                .mapToDouble(x -> x)
                .average();
        System.out.println("Snittlönen för en man är: "+ män.getAsDouble()+ "kr");


        Map<Gender, List<Person>> groupByGender = personer.stream()
                        .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((gender, people1) -> {
            people1.forEach(System.out::println);
            people1.forEach(x -> System.out.println(x.getSalary()+people1.size()));

        });


        System.out.println("------------------------------------------------------------------");
        //1.2
        personer.stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(1)
                .forEach(x -> System.out.println("Personen med högst lön är: " + x));
        System.out.println("------------------------------------------------------------------");

        //1.3
        personer.stream()
                .sorted(Comparator.comparing(Person::getSalary))
                .limit(1)
                .forEach(x -> System.out.println("Personen med lägst lön är: " + x));

    }
}
