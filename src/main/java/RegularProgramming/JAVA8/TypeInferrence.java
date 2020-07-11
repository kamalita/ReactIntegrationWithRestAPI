/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public class TypeInferrence {
    public static void main(String[] args) throws Exception {
//        stringLengthLambda stringLengthLambda=(String s)-> s.length();
//        System.out.println(stringLengthLambda.getLength("Hi Kamalita here"));
//        stringLengthLambda stringLengthLambda1=s-> s.length();
        try {
            print(s -> s.length());
            System.out.print(1/0);
        }
        catch (ArithmeticException e){
            System.out.print("in catch");
            throw e;
        }
        catch (Exception e){
            System.out.print("in catch 2"+ e.getStackTrace());
        }
        finally {
            System.out.print(1/0);
           // throw new Exception("thrown");
        }
    }

    public static void print(stringLengthLambda l){
        System.out.println(l.getLength("Hello world"));
    }

    interface stringLengthLambda{
        int getLength(String i);
    }
}
