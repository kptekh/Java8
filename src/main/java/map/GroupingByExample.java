package src.main.java.map;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> courseList = Arrays.asList("Computers","Physics","Maths","Physics","Computers","Physics");
        // Converting List to map by count of repeated
        Map<String, Long> courseMap = courseList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(courseMap);
        // Selecting the highest number of values.
//        Map.Entry<String, Long> valueSortedMap = courseMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
        Optional<Map.Entry<String, Long>> valueSortedMap = courseMap.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(valueSortedMap.get());
    }
}
