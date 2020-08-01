/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.io.FileNotFoundException;

public class String_Concat {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            String s="null";
            String t="abc";
            s.concat(t);
            System.out.println(s.concat("abc"));
            System.out.println(s);
            System.out.println("as".concat("abc"));
        }
        catch(Exception e){
            throw new FileNotFoundException();
        }
        finally {
            System.out.println("here");
            //throw new NullPointerException();
        }

    }
}
