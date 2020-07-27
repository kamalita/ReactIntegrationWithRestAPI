/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

public class ObjectRef {
    public static void main(String[] args) {
        Member m=new Member();
        MemberChild mc=new MemberChild();
        System.out.println(m.hashCode()+"---"+ mc.hashCode());

        m=new MemberChild();

        System.out.println(m.hashCode()+"---"+ mc.hashCode()+ "  -- "+ m.getClass());

        m.m1();
        m.m2();

    }

}

class Member {
    public  void m1() {
        System.out.println("Member m1");
    }
    public void m2() {
        System.out.println("Member m2");
    }
}

class MemberChild extends Member{
    public  void m1() {
        System.out.println("Member child m1");
    }
    public  void m3() {
        System.out.println("Member child m3");
    }

}
