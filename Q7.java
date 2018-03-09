/*
 * 7. Create an Employee class that takes input the name, age and salary of the employee. Ask
the user how many employee data he/she wants to input (say, n). Based on the value of n,
create an array of objects using class employee and ask the user to input data (name, age
and salary). The system then prints all the input and the name of the employee who gets
the highest salary.
 */

/**
 *
 * @author Aviral
 */

import javax.swing.JOptionPane;

public class Q7 
{
    public static void main(String[] args)
    {
        employee[] emp = new employee[10];
        int i,n,max=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the no. of employees : "));
        
        JOptionPane.showMessageDialog(null,"Enter details of the employees :-");
        
        for(i=0;i<n;i++)
        {
            JOptionPane.showMessageDialog(null,"Employee"+(i+1));
            emp[i]=new employee();
            emp[i].name=JOptionPane.showInputDialog(null,"Enter Name : ");
            emp[i].age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Age : "));
            emp[i].salary=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Salary : "));
        }
        
        JOptionPane.showMessageDialog(null,"The Data Entered is :-");
       
        for(i=0;i<n;i++)
        {
            emp[i].display();
            
            if(emp[max].salary<emp[i].salary)
            {
                max = i;
            }
        }
        
        JOptionPane.showMessageDialog(null,"The Employee with highest Salary is : "+emp[max].name);
    }
}

