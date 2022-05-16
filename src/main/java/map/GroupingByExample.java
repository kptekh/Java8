package src.main.java.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> courseList = Arrays.asList("Computers","Physics","Maths","Physics","Computers","Physics");
        Map<String, Long> courseMap = courseList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(courseMap);
    }
}
