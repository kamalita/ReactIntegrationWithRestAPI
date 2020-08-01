/*
 * Copyright (c) 2020.
 * Kamalita's coding
 *
 * Conditions: 1. No negative/0/duplicate numbers allowed in array.
 * 2. Is the array already sorted -> yes
 * 3. If N=0 then return 1
 *
 * ref: https://www.youtube.com/watch?v=nqlNzOcnCfs
 */

package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindSetsOfNumbersThatAddUpToN {
    private static int[] memo;
    static int result=0;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int input=sc.nextInt();
        memo = new int[]{2, 4, 6, 10};
        System.out.println("Result --> "+ calculate(input,memo.length-1));
    }

    private static int calculate(int input,int length) {
        if(input<=0){
            return 1;
        }
        Map<String , Integer> mem =new HashMap<String, Integer>();
        return rec(memo.length-1,memo,length-1,mem);
    }

    private static int rec(int i, int[] arr, int total, Map<String , Integer> mem) {
        int to_return=0;
        String key=total+":"+i;
        if(mem.containsKey(key)){
            return mem.get(key);
        }
        if(total==0){
            return 1;
        }
        else if(total<0 || i<0){
            return 0;
        }
        else if(total<arr[i]){
            to_return=rec(i-1,arr,total,mem);
        }
        else{
            to_return=rec(i-1, arr, total-arr[i], mem)+rec(i-1, arr, total, mem);
        }
        mem.put(key,to_return);
        return to_return;

    }


}
