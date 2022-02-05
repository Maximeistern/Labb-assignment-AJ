package com.company;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //1
        List<Person> personer = new ArrayList<>() {{
            add(new Person("Pelle", Gender.Male, 24000));
            add(new Person("Kajsa", Gender.Female, 27500));
            add(new Person("Peter", Gender.Male, 34000));
            add(new Person("Paula", Gender.Female, 38000));
            add(new Person("Lukas", Gender.Male, 22300));
            add(new Person("Linda", Gender.Female, 26420));
            add(new Person("Micke", Gender.Male, 26400));
            add(new Person("Johanna", Gender.Female, 22222));
            add(new Person("Max", Gender.Male, 40000));
            add(new Person("Karin", Gender.Female, 38500));
        }};

        //1.1
        OptionalDouble female = personer.stream()
                .filter(x -> x.getGender().equals(Gender.Female))
                .map(Person::getSalary)
                .mapToDouble(x -> x)
                .average();
        System.out.println("Snittlönen för en kvinna är: "+ female.getAsDouble()+ "kr");

        OptionalDouble man = personer.stream()
                .filter(x -> x.getGender().equals(Gender.Male))
                .map(Person::getSalary)
                .mapToDouble(x -> x)
                .average();
        System.out.println("Snittlönen för en man är: "+ man.getAsDouble()+ "kr");

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
