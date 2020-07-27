/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

public class StringLengthConfusion {
    public static void main(String[] args) {
        String in="\uD835\uDD38";
        System.out.println("regular length= "+in.length());
        System.out.println("accurate length= "+in.codePointCount(0,in.length()));
        int i=5/2;
        System.out.println(i);

    }
}
