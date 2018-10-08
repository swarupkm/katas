import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;

public class StreamTest {

    @Test
    public void test_streams() {
        Stream<String> stream = Stream.of("swarup", "swarup", "sadasda", "gddssfdsfsd");
        String first = stream.filter(input -> wordsStartingWithD(input, "D")).findAny().orElse("");
        System.out.println(first);


        List<Integer> integers = Arrays.asList(23, 21, 324, 33, 5, 435, 43, 54, 1, 654, 6, 546);

        // print the sum of top 5 even numbers
        System.out.println(integers.stream().filter(StreamTest::evenNumber).limit(5).mapToInt(i -> i).sum());


        System.out.println(integers.stream().mapToInt(Integer::intValue).sum());


    }


    @Test
    public void should_print_old_people() {
        Person p1 = new Person(21);
        Person p2 = new Person(41);
        Person p3 = new Person(61);
        Person p4 = new Person(27);
        Person p5 = new Person(27);
        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);


        Predicate<Person> personGreater20 = person -> person.age() > 20;
        persons.stream().filter(personGreater20).forEach(System.out::println);

        Predicate<Person> lessThan30 = person -> person.age() < 30;
        persons.stream().filter(lessThan30).forEach(System.out::println);

        persons.stream().max(comparingInt(Person::age)).ifPresent(System.out::println);

    }

    private static boolean evenNumber(Integer i) {
        return i % 2 == 0;
    }

    private boolean wordsStartingWithD(String input, String c) {
        return input.startsWith(c);
    }

}
