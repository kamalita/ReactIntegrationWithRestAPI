package RegularProgramming;

/*
The elements in the array is from 0 to n-1 and all of them are positive.
So to find out the duplicate elements, a HashMap is required, but the question is to solve the problem in constant space.
There is a catch, the array is of length n and the elements are from 0 to n-1 (n elements).
The array can be used as a HashMap.
*/

public class DuplicateValuePrint {
    public static void main(String[] args) {
        int[] arr={6,2,4,3,4,5,3};
        System.out.println(" Duplicate: ");
        for(int i=0;i<arr.length;i++){
            int val=arr[Math.abs(arr[i])];
            if(val>0){
                arr[Math.abs(arr[i])] =-val;
            }
            else
            {
                System.out.print(Math.abs(arr[i])+" ");
            }
        }
    }
}
