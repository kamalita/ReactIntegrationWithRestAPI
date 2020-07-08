/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.util.Scanner;

public class FindSetsOfNumbersThatAddsUptoNwithRecursion {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int input=sc.nextInt();
        int []memo = new int[]{2, 4, 6, 10,16};
        System.out.println("Result --> "+ count_sets(memo,input));
    }

    private static int count_sets(int[] input, int total) {
        return rec(input,total,input.length-1);
    }

    private static int rec(int[] input, int total, int i) {
        if(total==0){
            return 1;
        }
        else if(total<0 || i<0){
            return 0;
        }
        else if(total<input[i]){
            return rec(input,total,i-1);
        }
        else{
            return rec(input,total-input[i],i-1)+rec(input,total,i-1);
        }

    }
}
