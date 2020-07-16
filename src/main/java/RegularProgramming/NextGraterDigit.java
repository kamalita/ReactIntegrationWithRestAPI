/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NextGraterDigit {
    Set<Integer> set=new TreeSet<Integer>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digitLength=sc.nextInt();
        int input=sc.nextInt();
        getNextNumber(digitLength,input);
    }

    private static void getNextNumber(int digitLength,int _input) {
        int i=0,input=_input;
        int[] arr = new int[digitLength];
        while(input>0){
            arr[i]=input%10;
            input=input/10;
            i++;
        }
        permute(arr, 0);
        Arrays.stream(arr).sorted().filter((l)->l>_input).forEach(System.out::println);

    }

    private static void permute(int[] a, int k) {
        if (k == a.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                System.out.print( a[i]);
            }
            System.out.println();
        }
       else {
            for (int i = k; i < a.length; i++) {
                swap(a[k], a[i]);
                permute(a, k + 1);
                swap(a[k], a[i]);
            }
        }
    }

    private static void swap(int i,int j){
        i=i+j;
        j=i-j;
        i=j-i;
    }

}
