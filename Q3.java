/*
 3. Write a program that takes integer n as input and prints a pattern. For example, if n=9, your
program should print
12345678987654321
234567898765432
3456789876543
45678987654
567898765
6789876
78987
898
9
 */

/**
 *
 * @author Aviral
 */


import javax.swing.JOptionPane;

public class Q3 
{
    public static void main(String[] args)
    {
        int i,j,n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a digit greater than zero : "));
        
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(j=n-1;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}