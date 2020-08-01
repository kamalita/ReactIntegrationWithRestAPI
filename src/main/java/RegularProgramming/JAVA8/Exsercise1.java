/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exsercise1 implements ICompare{
    public static void main(String[] args) {
        List<Person> list= Arrays.asList(new Person("kamalita","biswas",10),
                        new Person("jajal","aiswas",80),
                        new Person("jajal","kiswas",30),
                        new Person("aiii","bkswas",26));

        list.forEach(System.out::println);
        //Stream.of(list).forEach(System.out::println);
        //Stream.of(list).forEach(s->s.compare);
        Collections.sort(list,(x1,x2)->x1.getLastName().compareTo(x2.getLastName()));
        System.out.println("list-> "+list);
        Collections.sort(list, Comparator.comparing(Person::getLastName));
        System.out.println("list 2-> "+list);
        Collections.sort(list, Comparator.comparing(Person::getAge));
        System.out.println("list age-> "+list);
        Collections.sort(list, Comparator.comparing(Person::toString));
        System.out.println("list on string-> "+list);
        //With regular way of comparing
//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()>o2.getAge()?1:0;
//            }
//        });
        Collections.sort(list, (o1, o2) -> o1.getAge()<o2.getAge()?1:0);
        System.out.println("list on age-> "+list);

    }
    @Override
    public int compare(Person person1,Person person2) {
        return person1.getAge()>person2.getAge()?person1.getAge():person2.getAge();
    }
}
@FunctionalInterface
interface ICompare{
    int compare(Person person1,Person person2);
}
