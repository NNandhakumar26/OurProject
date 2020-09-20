package calculator;
import javax.swing.JOptionPane;

public class Calci {
	public int addition(int a, int b)
	{
		return a+b;
	}
	public int subraction(int a, int b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Calci c=new Calci();
		String input;
		int a;
		int b;
		//input =JOptionPane.showInputDialog("This is a calculator program consisting of:\n1.Addition by Deepak\n2.Subraction by Anand\n3.Multiplication and Division by Nandha");
		input =JOptionPane.showInputDialog("This is a calculator program where:\n1.Addition by\t Deepak\n2.Subraction by\t Anand\n3.Multiplication and Division by\t Nandha\nEnter the first value");
		a=Integer.parseInt(input);
		input=JOptionPane.showInputDialog("Enter the second value");
		b=Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "Deepak says that The addition is "+c.addition(a, b));
		JOptionPane.showMessageDialog(null, "Anand says that The subraction is "+c.subraction(a, b));
		JOptionPane.showMessageDialog(null, "Nandha says that The multiplication is "+c.multiplication(a, b));
		JOptionPane.showMessageDialog(null, "Nandha says that The division is "+c.division(a, b));
	}
}
