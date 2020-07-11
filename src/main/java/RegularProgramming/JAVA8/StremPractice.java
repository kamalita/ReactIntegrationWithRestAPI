/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremPractice {
    public static void main(String gh[]){
        StremPractice stremPractice=new StremPractice();
//        IntStream.range(-1,10).forEach(System.out::println);
        //IntStream.range(-5,10).forEachOrdered(System.out::println);
//       IntStream.range(10,21).average().ifPresent(System.out::println);
//        IntStream.range(1,10).skip(3).forEach(x->System.out.println(x));
//        System.out.println( IntStream.range(1, 5).sum());

        String[] input={"ahy","jdhdf","sak","say","hyr","qte","adde"};
        Stream.of(input).map(x->x.toUpperCase()).filter(x-> x.contains("A")).sorted().forEach(System.out::println);

        int[] input_1={1,5,2,-4,1,43,6,-9,07,4,32,4,234,-33,-34,3,0};
        Arrays.stream(input_1).map(x-> x*x).filter(x->x>100).forEach(System.out::println);

        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"qwe");
        map.put(3,"qqae");
        map.put(2,"qwre");
        map.put(42,"qwsd");
        //Arrays.stream(map.keySet().toArray()).forEach(System.out::println);
        Arrays.stream(input).filter(s-> s.startsWith("a")).forEach(System.out::print);

//        IFunctionalInterface lambda;
//        lambda = ()-> System.out.println("lembda function executed");

    }

}
