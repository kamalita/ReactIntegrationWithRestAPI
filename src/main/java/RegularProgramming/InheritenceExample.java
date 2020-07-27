/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.io.FileNotFoundException;
import java.lang.module.FindException;

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

        InheritenceExample inheritenceExample=new InheritenceExample();
        inheritenceExample.testIparentNonStatic();

    }
    void  m1() throws Exception{
        try{
            String s=null;
            s.concat("asd");

        }
        catch (Exception e){
            throw new FileNotFoundException();
        }
        finally {
            throw new FileNotFoundException();
        }
    }

    @Override
    public void testIparentNonStatic() {
        float f=0.100000000f;
        Float f1= (float) ( 1/10);
        Double d= 67.90;
        Long l= 678L;
        System.out.println("float mark : "+f1.equals(f));
    }
}

class Parent {
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
    void testIparentNonStatic();
}

