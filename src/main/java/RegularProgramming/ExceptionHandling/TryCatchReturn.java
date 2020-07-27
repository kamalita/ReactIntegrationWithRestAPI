/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.ExceptionHandling;

public class TryCatchReturn {

    public static void main(String[] args) {
        System.out.println(checkReturn());
    }
    public static boolean checkReturn(){
        try{
            System.out.println("check");
            return true;

        }
        finally {
            //  ******** test 1 ******
            //only one value returns, if finally has return try return will vanish
            //if finally exits without return null wil be returned

            //System.exit(0);
            //return false;

            System.out.println("ended");

        }
    }
}
