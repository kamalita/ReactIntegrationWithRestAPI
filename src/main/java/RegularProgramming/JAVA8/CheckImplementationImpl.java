/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public abstract class CheckImplementationImpl implements ICheckImplementaion{
    static int id=3;
    public abstract void checkAbstract();
    static void checkImplementation(){
        System.out.println("checkImplementation  in abstract- "+id);
    }
}
