package src.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Opgave A:");
        System.out.println("First person with the age of 44: " + findFirst(persons, fireOgFyrre));
        System.out.println();
        System.out.println("Opgave B: ");
        System.out.println("First person whom starts with 'S' " + findFirst(persons, startsWithS));
        System.out.println();
        System.out.println("Opgave C: ");
        System.out.println();
        System.out.println("Name which contains more than one 'i': " + findFirst(persons, moreThanOneI));
        System.out.println();
        System.out.println("Opgave D: ");
        System.out.println("Name and age with equal chars: " + findFirst(persons, charAgeEqualtoName));
        System.out.println();
        System.out.println("Check; findAll metode");
        System.out.println();
        System.out.println("Name which contains 'i': " + findAll(persons, nameContainsI));
        System.out.println();
        System.out.println("Opgave G: ");
        System.out.println("Name which starts with 'S': " + findAll(persons, nameStartsWithS));
        System.out.println();
        System.out.println("Opgave H: ");
        System.out.println("Name char length of '5': " + findAll(persons, charLengthFive));
        System.out.println();
        System.out.println("Opgave I: ");
        System.out.println("Name with length higher than 5 chars and age lower than 40: " + findAll(persons, certainNameAge));
        System.out.println();
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List<Person> findAll (List<Person> list, Predicate<Person> filter) {
        List<Person> arrP = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p)){
                arrP.add(p);
            }
        }
        return arrP;
    }


    static Predicate<Person> fireOgFyrre = person -> {
        return person.getAge() == 44;
    };

    static Predicate<Person> startsWithS = person -> {
        return person.getName().startsWith("S");
    };

    static Predicate<Person> moreThanOneI = person -> {

        return person.getName().indexOf("i") != person.getName().lastIndexOf("i");
    };

    static Predicate<Person> charAgeEqualtoName = person -> {
        return person.getName().length() == person.getAge();
    };

    static Predicate<Person> nameContainsI = person -> {
        return person.getName().contains("i");
    };

    static Predicate<Person> nameStartsWithS = person -> {
        return person.getName().startsWith("S");
    };

    static Predicate<Person> charLengthFive = person -> {
        return person.getName().length() == 5;
    };

    static Predicate<Person> certainNameAge = person -> {
        return person.getName().length() >= 6 && person.getAge() < 40;
    };





}
