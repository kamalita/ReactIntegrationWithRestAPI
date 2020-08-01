package RegularProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        Map<Emp, String> map = new HashMap<Emp, String>();
        map.put(new Emp(23, "kamalita", 12), "ss");
        map.put(new Emp(13, "kajal", 32), "ee");
        map.put(new Emp(43, "hhp", 31), "eqw");

        map.entrySet().forEach(System.out::println);

        //Stream.iterate(map.keySet()).forEach(System.out::print);


    }
}

class Emp{
    int id;
    int age;
    String name;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    Emp(int age, String name, int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
