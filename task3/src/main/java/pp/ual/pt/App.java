package pp.ual.pt;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("1", "Alice", 28),
                new Person("2", "Trudy", 32),
                new Person("3", "Anna", 24),
                new Person("4", "Bob", 40),
                new Person("5", "James", 18)
        );


        //contagem de pessoas com idade igual ou superior à média
        System.out.println(people.stream().filter(person -> person.getAge() >= people.stream().mapToInt(Person::getAge).average().getAsDouble()).count());

        //desvio padrão das idades
        System.out.println(Math.sqrt((people.stream().mapToDouble(person -> Math.pow(person.getAge() - people.stream().mapToInt(Person::getAge).average().getAsDouble(), 2)).sum() / people.size())));

        //mapa
        Map<String, Person> personMap = people.stream().collect(Collectors.toMap(person -> person.getId(), person -> person));
        personMap.forEach((id, person) -> System.out.println(person.getId() + "=Person(" + person.getId() + ", " + person.getName() +", " + person.getAge() + ")"));


    }
}
