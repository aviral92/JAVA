/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviral
 * 1. Write a program that prints numbers from 1 to 50, but for numbers that are multiples of 5,
	print HiFive, and for numbers that are divisible by both 2 and 3, print Georgia.
 */
public class Q1 
{
   public static void main(String[] args)
   {
   
    int i;
    
    for(i=1;i<=50;i++)
    {
     if((i%5)==0)
        System.out.println("HiFive");
     if((i%6)==0) 
          System.out.println("Georgia");
     if(((i%5)!=0)&&((i%6)!=0))
         System.out.println(i);
    }
 
 
}
}