/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming;

import java.io.FileNotFoundException;

public class String_Concat {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            String s=null;
            System.out.println(s.concat("abc"));
        }
        catch(Exception e){
            throw new FileNotFoundException();
        }
        finally {
            System.out.println("here");
            throw new NullPointerException();
        }

    }
}
