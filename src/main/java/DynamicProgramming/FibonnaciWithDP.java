/*
 * Copyright (c) 2020.
 * Kamalita's coding
 *
 * Memoized Solution
 */

package DynamicProgramming;

import java.util.Scanner;

public class FibonnaciWithDP {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int input=sc.nextInt();
        int[] memo = new int[input+1];

        System.out.println("Result --> "+ calculateFibonacci(input,memo));
    }

    private static int calculateFibonacci(int input, int[] memo) {
            int result;
        if(memo[input]>0){
            return memo[input];
        }
        if(input==1||input==2){
            result=1;
        }
        else{
            result=calculateFibonacci(input-1,memo)+calculateFibonacci(input-2,memo);
            memo[input]=result;
            return result;
        }
        return result;
    }
}
