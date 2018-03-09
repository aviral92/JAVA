/*
5. Write a method that returns the index of the smallest element in an array of integers. If there
are more than one such element, return the smallest index.
public static int indexOfSmallestElement(int[] list)
 */

/**
 *
 * @author Aviral
 */
import javax.swing.JOptionPane;

public class Q5 {    
    
    public static int indexOfSmallestElement(int[] list)
    {
        int small,i,index=0;
        small =list[0];
        for(i=1;i<10;i++)
        {
            if(list[i]<small)
            {
                small=list[i];
                index=i;
            }
           
               
        }
          return index;  
    }
    
    public static void main(String[] args)
    {
        int a[]=new int[10];
        int n,i;
        JOptionPane.showMessageDialog(null,"enter the array");
        for(i=0;i<10;i++)
                {
                    a[i]=Integer.parseInt(JOptionPane.showInputDialog(null," "));
                }
        n= indexOfSmallestElement(a);
        System.out.println("The index of the smallest element is" + n);
    }

}
