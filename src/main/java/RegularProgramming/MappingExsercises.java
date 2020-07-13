/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MappingExsercises {
    public static void main(String[] args) {
        Map<Person, Integer> hashMap=new HashMap<Person, Integer>();
        Map<Person, Integer> linkedHashMap=new LinkedHashMap<Person, Integer>();
        Map<Person, Integer> concurrentHashMap=new ConcurrentHashMap<Person, Integer>();
        Map<Person, Integer> weakHashMap=new WeakHashMap<Person, Integer>();
        Map<Person,Integer> treeMap=new TreeMap<Person,Integer>();

        System.out.println("\t\tHashMap\n ");

        hashMap.put(new Person("kamalita",13),130);hashMap.put(new Person("kamalita",13),13);
        hashMap.put(new Person("amalita",13),130);hashMap.put(new Person("malita",13),13);
        Arrays.stream(hashMap.keySet().toArray()).forEach(System.out::println);
        System.out.println("The map size --> "+hashMap.size());
        System.gc();
        System.out.println("The map size --> "+hashMap.size());

        System.out.println("\n\t\tLinkedHashMap\n ");

        linkedHashMap.put(new Person("kamalita",13),130);linkedHashMap.put(new Person("kamalita",13),13);
        linkedHashMap.put(new Person("amalita",13),130);linkedHashMap.put(new Person("malita",13),13);

        Arrays.stream(linkedHashMap.keySet().toArray()).forEach(System.out::println);
        System.out.println("The map size --> "+linkedHashMap.size());
        System.gc();
        System.out.println("The map size --> "+linkedHashMap.size());

        System.out.println("\n\t\tConcurrentHashMap\n ");

        concurrentHashMap.put(new Person("kamalita",13),130);concurrentHashMap.put(new Person("kamalita",13),13);
        concurrentHashMap.put(new Person("amalita",13),130);concurrentHashMap.put(new Person("malita",13),13);

        Arrays.stream(concurrentHashMap.keySet().toArray()).forEach(System.out::println);
        System.out.println("The map size --> "+concurrentHashMap.size());
        System.gc();
        System.out.println("The map size --> "+concurrentHashMap.size());


        System.out.println("\n\t\tweakHashMap\n ");

        weakHashMap.put(new Person("kamalita",13),130);weakHashMap.put(new Person("kamalita",13),13);
        weakHashMap.put(new Person("amalita",13),130);weakHashMap.put(new Person("malita",13),13);

        //Arrays.stream(concurrentHashMap.keySet().toArray()).forEach(System.out::println);
        System.out.println("The map size before gc() --> "+weakHashMap.size());
        System.gc();
        System.out.println("The map size after gc()--> "+weakHashMap.size());

        System.out.println("\n\t\ttreeHashMap\n ");

        treeMap.put(new Person("kamalita",13),130);treeMap.put(new Person("kamalita",13),13);
        treeMap.put(new Person("amalita",13),130);treeMap.put(new Person("malita",13),13);

        Arrays.stream(treeMap.keySet().toArray()).sorted().forEach(System.out::println);
        System.out.println("The map size before gc() --> "+treeMap.size());
    }

}

class Person implements Comparable<Person>{
    String name;
    int age;
    Person(String name, int age ){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person p) {
        if(p.equals(this))
            return 0;
        else if(p.age>this.age)
            return 1;
        else
        return -1;
    }
}
