/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.util.*;

public class orderedInteger {
    public static void main(String[] args) {
        int arr[]={3,1,334,2,3};
        //System.out.println(getUnique(arr));
        Arrays.stream(getUnique(arr)).forEach(System.out::println);
    }
    static Integer[] getUnique(int[] arr){
        Set<Integer> set=new LinkedHashSet<Integer>();
        for(int i: arr){
            set.add(i);
        }
        Integer rr[]=set.toArray(new Integer[0]);

        return rr;






    }
}


