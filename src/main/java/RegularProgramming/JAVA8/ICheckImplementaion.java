/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public interface ICheckImplementaion {
    static int h = 0;
     void checkAbstract();

     //Not possible as abstract class will not allow to create an object
     //void noImpleInAbstract();

    static void checkImplementation(){
        System.out.println("not so abstract checkImplementation");
    }


    //default method in Interface
    //Can be overridden and can be called from object created by Iclass iclass=new ClassImpl(); way
    default void defaultMethod(){
        System.out.println("ICheckImplementaion  in interface- 0");
    }
}
