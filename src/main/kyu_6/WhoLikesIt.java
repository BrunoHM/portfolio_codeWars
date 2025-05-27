package main.kyu_6;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class WhoLikesIt {
    //Kata: https://www.codewars.com/kata/5266876b8f4bf2da9b000362

    public static void main(String[] args) {
        System.out.println( whoLikesIt().equals("no one likes this") );
        System.out.println( whoLikesIt("Peter").equals("Peter likes this") );
        System.out.println( whoLikesIt("Jacob", "Alex").equals("Jacob and Alex like this") );
        System.out.println( whoLikesIt("Max", "John", "Mark").equals("Max, John and Mark like this") );
        System.out.println( whoLikesIt("Alex", "Jacob", "Mark", "Max").equals("Alex, Jacob and 2 others like this") );
    }

    public static String whoLikesIt(String... names) {
        String abc = Stream.of(names).collect(
                        Collector.of(
                                ArrayList::new,
                                ArrayList::add,
                                (objects, objects2) -> {
                                    objects.addAll(objects2);
                                    return objects;
                                },
                                s -> s.isEmpty() ? "no one likes this" :
                                        s.size() == 1 ? s.get(0)+" likes this" :
                                                s.size() == 2 ? s.get(0)+" and "+s.get(1)+" like this" :
                                                        s.size() == 3 ? s.get(0)+", "+s.get(1)+" and "+s.get(2)+" like this" :
                                                                s.get(0)+", "+s.get(1)+" and "+(s.size()-2)+" others like this"
                        )
                );

        return abc;
    }
}
