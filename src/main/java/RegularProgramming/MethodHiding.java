/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

public class MethodHiding {
    public static void main(String[] args) {
        ParentClass p=new ChildClass();
        p.A();
    }
}

class ParentClass{
    static void A() {
        System.out.println("in Parent");
    }
}
class ChildClass extends ParentClass{
    static void A() {
        System.out.println("in child");
    }
}
