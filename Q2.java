/*
2. Write a program that takes integer n as input and prints the sum of a pattern. For example, if
n= 100, you should print the value of
1/2 + 2/3 + 3/4 + 4/5 + … + 98/99 + 99/100
 */

/**
 *
 * @author Aviral
 */
import javax.swing.JOptionPane;
public class Q2 {
   public static void main(String[] args)
   {   
    int num;
    double d=0,n,i;
    String x=JOptionPane.showInputDialog(null,"enter n");
    num=Integer.parseInt(x);
    for(i=1;i<=num;i++)
    	{
    		n=i/(i+1);
    		d=d+n;
    	}
    System.out.println("The result is " + d);
   }    
}
