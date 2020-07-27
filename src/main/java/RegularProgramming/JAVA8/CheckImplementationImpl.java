/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public abstract class CheckImplementationImpl implements ICheckImplementaion,ICheckImplementaion2 {
    static int id=3;
    static int staticBlockCount=1;
    public abstract void checkAbstract();
    static void checkImplementation(){
        System.out.println("checkImplementation  in abstract- "+id);
    }

    //Only called once even if you create multiple objects
    static{
        System.out.println("in static "+(++staticBlockCount));
    }

    @Override
    public void defaultMethod() {
        //needed to implement the common default method as both the interface has default method defaultMethod()
    }

}
