/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public class ImplCheckImplementation extends CheckImplementationImpl{
    public static void main(String[] args) {
        ICheckImplementaion iCheckImplementaion=new ImplCheckImplementation();
        iCheckImplementaion.checkAbstract();
        CheckImplementationImpl iCheckImplementaion2=new ImplCheckImplementation();
        iCheckImplementaion2.checkAbstract();
        iCheckImplementaion2.checkImplementation();
        ICheckImplementaion.checkImplementation();
    }

    @Override
    public void checkAbstract() {
        System.out.println("checkImplementation  in impl- "+id);
    }
}
