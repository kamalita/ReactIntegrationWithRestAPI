/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public class ImplCheckImplementation extends CheckImplementationImpl{

    public static void main(String[] args) {


        ICheckImplementaion iCheckImplementaion=new ImplCheckImplementation();
        iCheckImplementaion.checkAbstract();
        iCheckImplementaion.defaultMethod();
        ICheckImplementaion.checkImplementation();


        //Not possible
        //iCheckImplementaion.checkRegularMethod();


        CheckImplementationImpl iCheckImplementaion2=new ImplCheckImplementation();
        iCheckImplementaion2.checkAbstract();
        iCheckImplementaion2.checkImplementation();
        ICheckImplementaion.checkImplementation();


        //Not possible
        //iCheckImplementaion2.checkRegularMethod();


    }

    void checkRegularMethod(){
        System.out.println("in last implementation method regular");
    }

    @Override
    public void checkAbstract() {
        System.out.println("checkImplementation  in impl- "+(++id));
    }
    static void checkImplementation(){
        System.out.println("checkImplementation  in impl- "+(++id));
    }
}
