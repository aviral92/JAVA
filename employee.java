/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviral
 */
import javax.swing.JOptionPane;

public class employee {
     String name;
    int age;
    int salary;
    
    void input(String nam, int ag, int sal)
    {
        name = nam;
        age = ag;
        salary = sal;
    }
    
    void display()
    {
        JOptionPane.showMessageDialog(null,"Name\t:"+name+"\nAge\t:"+age+"\nSalary\t:"+salary);
    }
}
