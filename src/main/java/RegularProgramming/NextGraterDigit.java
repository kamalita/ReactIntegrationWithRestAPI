/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import DependencyInjection.DITest;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class NextGraterDigit {

    static Set<Integer> set=new TreeSet<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1.longValue()>o2.longValue())
                return 1;
            else if(o1.longValue()<o2.longValue())
                return -1;
            else
                return 0;
        }
    });


    static Set<Integer> newSet= new TreeSet<>((o1, o2) -> o1.longValue() > o2.longValue() ? 1 : -1);

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input: ");
        String input=sc.nextLine();
        int digitLength=sc.nextInt();

        System.out.println("the input is input: "+input);
        getNextNumber(digitLength,input);

    }

    private static void getNextNumber(int digitLength,String _input)
    {
        printDistinctPermutn(_input,"");
       //set.stream().forEach(System.out::println);
       System.out.print("resilt: ");
       set.stream().filter(i->i>Integer.parseInt(_input)).limit(1).forEach(System.out::print);

       //newSet.stream().sorted().forEach(System.out::println);
    }


    // Function to generate all cyclic
    // permutations of a number
    static void getParmutation(int N,int len)
    {
        int num = N;

        while (num>0) {
            //System.out.println(num);
            set.add(num);


            // Following three lines generates a
            // circular permutation of a number.
            int rem = num % 10;
            int dev = num / 10;
            num = (int)((Math.pow(10, len - 1)) *
                    rem + dev);

            getParmutation(num/10,len--);

            // If all the permutations are
            // checked and we obtain original
            // number exit from loop.

        }
    }

    static void printDistinctPermutn(String str,
                                     String ans)
    {

        // If string is empty
        if (str.length() == 0) {

            // print ans
            set.add(Integer.parseInt(ans));
            return;
        }

        // Make a boolean array of size '26' which
        // stores false by default and make true
        // at the position which alphabet is being
        // used
        boolean alpha[] = new boolean[10];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (alpha[ch - '0'] == false)
                printDistinctPermutn(ros, ans + ch);
            alpha[ch - '0'] = true;
        }
    }


}
