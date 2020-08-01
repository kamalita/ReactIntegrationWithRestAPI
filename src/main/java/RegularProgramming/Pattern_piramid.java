package RegularProgramming;

public class Pattern_piramid {
    public static void main(String[] args)
    {
        int num=10;
        for(int i=1;i<num;i++)
        {
            int count=i;
            for(int j=1;j<num-count;++j)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
