/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public class LambdaExpression {
    public static void main(String[] args) {
        doWork(s->s+s);
    }

    public static void doWork(ITest iTest){
        System.out.println(iTest.testPrint(1234));
    }
@FunctionalInterface
    interface ITest{
        Object testPrint(int i);
        static void test(){
            System.out.println("another");
        }
        //int testPrint1(int i);
    }

}
