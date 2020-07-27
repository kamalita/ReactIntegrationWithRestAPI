/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public interface ICheckImplementaion2 {
    void checkAbstract();
    default void defaultMethod(){
        System.out.println("ICheckImplementaion  in interface- 0");
    }
}
