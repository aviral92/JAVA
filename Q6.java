/*
 6. Write a program that takes two 3*3 matrices and prints the sum and product of the
matrices.
 */

/**
 *
 * @author Aviral
 */

import javax.swing.JOptionPane;
public class Q6 {
     public static void main(String[] args) 
    {
        int i,j,k,m,n,p,q,f1=0,f2=0;
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        
        
         String w,x,y,z;
                 w=JOptionPane.showInputDialog(null,"enter rows of first matrix");
                 m=Integer.parseInt(w);
                  x=JOptionPane.showInputDialog(null,"enter columns of first matrix");
                 n=Integer.parseInt(x);
                  y=JOptionPane.showInputDialog(null,"enter rows of second matrix");
                 p=Integer.parseInt(y);
                  z=JOptionPane.showInputDialog(null,"enter columns of secod matrix");
                 q=Integer.parseInt(z);
        
        JOptionPane.showMessageDialog(null,"enter the first matrix row wise :-");       
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,""));
            }
        }
        
        JOptionPane.showMessageDialog(null,"enter the second matrix row wise :-");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
               b[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,""));
            }
        }
        
        
        if((m==p)&&(n==q))
        {     
            f1=1;
        
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
               c[i][j] = a[i][j] + b[i][j]; 
            }
        }
        }
        else
        {
        System.out.println("the matrices cannot be added");
        
        }
        
        if(f1==1)
        {
        System.out.print("Sum of the Matrices is :-\n\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
        }
        
        if(n==p)
        {
            f2=1;
        for(i=0;i<3;i++)
        {
            System.out.print("\t");
            for(j=0;j<3;j++)
	    {
		c[i][j]=0;
		for(k=0;k<3;k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                   
		}
            }
        }
        }
    
        if(f2==1)
        {
        System.out.print("Product of the Matrices is :-\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
               System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
    }
    
     else
     {
     System.out.println("the matrices cannot be multiplied");
     }
}
}
