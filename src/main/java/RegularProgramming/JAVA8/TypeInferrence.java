/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public class TypeInferrence {
    public static void main(String[] args) {
//        stringLengthLambda stringLengthLambda=(String s)-> s.length();
//        System.out.println(stringLengthLambda.getLength("Hi Kamalita here"));
//        stringLengthLambda stringLengthLambda1=s-> s.length();
        print(s->s.length());
    }

    public static void print(stringLengthLambda l){
        System.out.println(l.getLength("Hello world"));
    }

    interface stringLengthLambda{
        int getLength(String i);
    }
}
