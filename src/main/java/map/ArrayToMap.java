package src.main.java.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {

    public static void main(String[] args) {
        Integer arr[][] ={{1980, 1}, {2001, 3}, {2003, 0}};

        Map<Integer, Integer> map = Arrays.stream(arr).collect(Collectors.toMap(e->e[0], e-> e[1]));
        System.out.println(map);

        Map.Entry<Integer, Integer> maxMedalEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(maxMedalEntry);

        List<String> stringList = Arrays.asList("apple", "banana", "orange");

        printUsingMap(stringList);
        List<String> stringList1 = Arrays.asList("apple", "orange","apricot", "banana");
        System.out.println("Using merger ");
        stringList1.stream().collect(Collectors.toMap(e-> e.charAt(0), e->e, (e,v)->v+"|"+v)).entrySet().forEach(e->{
            System.out.println(e.getKey()+" "+e.getValue());
        });
        System.out.println("Using merger and supplier ");
        stringList1.stream().collect(Collectors.toMap(e-> e.charAt(0), e->e, (e,v)->v+"|"+v, LinkedHashMap::new)).entrySet().forEach(e ->{
            System.out.println(e.getKey()+" "+e.getValue());
        });
    }

    private static void printUsingMap(List<String> stringList) {
        stringList.stream().collect(Collectors.toMap(e-> e.charAt(0), e->e)).entrySet().stream().forEach(e ->{
            System.out.println(e.getKey()+" "+e.getValue());
        });
    }
}
