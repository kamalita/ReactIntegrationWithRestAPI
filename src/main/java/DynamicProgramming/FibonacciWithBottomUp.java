/*
 * Copyright (c) 2020.
 *
 * Kamalita's coding
 *
 * Botoom-Up Approch
 *
 */

package DynamicProgramming;

import java.util.Scanner;

public class FibonacciWithBottomUp {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int input=sc.nextInt();
        int[] memo = new int[input+1];

        System.out.println("Result --> "+ calculateFibonacci(input,memo));
    }

    private static int calculateFibonacci(int input, int[] memo) {
        memo[0]=memo[1]=1;
        for(int i=2;i<memo.length;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[input];
    }
}
