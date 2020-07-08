package RegularProgramming;

import java.util.Scanner;

public class FibonacciWithRecurrsion {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        System.out.println("Result --> "+ calculateFibonacci(sc.nextInt()));
    }
    private static int calculateFibonacci(int input){
        int result=0;
        if(input==1| input==2){
            result =1;
        }
        else
            result=calculateFibonacci(input-1)+calculateFibonacci(input-2);
        return result;
    }

}
