/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

import java.util.function.BiConsumer;

public class ExserciseWithExceptionHandling {
    public static void main(String[] args) {
        int[] numbers={1,6,3,41,5};
        int key=0;

        try {
            check(numbers, key, (v, k) -> System.out.println(v / k));
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.getStackTrace();
        }
    }

    public static void check(int[] numbers, int key, BiConsumer<Integer,Integer> consumer){
        for (int i:numbers) {
            consumer.accept(i,key);
        }
    }
}
