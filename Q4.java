import javax.swing.JOptionPane;

/*
 * Write a method that will return the sum of all digits in an integer. The method signature is as
follows:
(for example, sum(1234) returns 10 and sum(12345) returns 15.)
public static int sum(int number)
 */
public class Q4 {

	public static int sumDigits(int n) {
		int sum =0;
		while(n!=0) {
			sum = sum +(n%10);
			n = n/10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		int n, sum ;
		n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number : "));
		sum = sumDigits(n);
		System.out.println("Sum of digits is "+sum);
	 }
}
