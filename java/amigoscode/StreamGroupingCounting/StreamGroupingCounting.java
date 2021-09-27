package StreamGroupingCounting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupingCounting {
    public static void main(String[] args) {
        groupingAndCounting();
    }

    public static void groupingAndCounting() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Mariam");
        names.add("Alex");
        names.add("Muhammad");
        names.add("Muhammad");
        names.add("Vincent");
        names.add("Alex");
        names.add("Alex");

        Map<String, Long> counting = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        counting.forEach((name, count) -> System.out.println(name + " -> " + count));
    }
}
