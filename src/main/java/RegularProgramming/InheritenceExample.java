/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

public class InheritenceExample extends Parent implements IParent{
    void check(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent product=new InheritenceExample();
        // Not possible as compile time error
        //product.check();

        IParent iParent=new InheritenceExample();
        //Compile time error
        //iParent.testIParent();
    }
}

class Parent{
    void test(){
        System.out.println("parent");
        synchronized(this) {
            System.out.println("Iparent");
        }
    }

}

interface IParent{
    // Not possible Compile time error
    //static void testIParent();
    static void testIParent(){
        System.out.println("Iparent");
    }
}

